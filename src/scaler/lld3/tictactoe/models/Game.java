package scaler.lld3.tictactoe.models;

import scaler.lld3.tictactoe.exceptions.DuplicateSymbolException;
import scaler.lld3.tictactoe.exceptions.MoreThanOneBotException;
import scaler.lld3.tictactoe.exceptions.PlayerAndDimensionMismatchException;
import scaler.lld3.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState state;
    private int nextPlayerMoveIndex;
    private List<WinningStrategy> winningStrategies;

    private Game(int size, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(size);
        this.players = players;
        this.moves = new ArrayList<>();
        this.state = GameState.IN_PROGRESS;
        this.nextPlayerMoveIndex = 0;
        this.winningStrategies = winningStrategies;
    }

    public static GameBuilder builder() {
        return new GameBuilder();
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public Player getWinner() {
        return winner;
    }

    public GameState getState() {
        return state;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void display() {
        board.display();
    }

    public void makeMove() {
        Player currentPlayer = this.players.get(nextPlayerMoveIndex);
        System.out.println(String.format("It's %s's turn. Please make your move.", currentPlayer.getName()));

        Move move = currentPlayer.makeMove(board);
        System.out.println(String.format("%s has made a move at row: %s and column: %s", currentPlayer.getName(), move.getCell().getRow(), move.getCell().getCol()));

        if (!isValidMove(move)) {
            System.out.println("Invalid Move! Please try again ...");
            return;
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Cell cellToChange = board.getBoard().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setPlayer(move.getPlayer());

        Move finalMove = new Move(cellToChange, currentPlayer);
        moves.add(finalMove);

        nextPlayerMoveIndex = (nextPlayerMoveIndex + 1) % players.size();


        if (checkWinner(board, finalMove)) {
            state = GameState.WIN;
            winner = currentPlayer;
        } else if (moves.size() == this.board.getSize() * this.board.getSize()) {
            state = GameState.DRAW;
        }
    }

    private boolean checkWinner(Board board, Move lastMove) {
        for (WinningStrategy winningStrategy : winningStrategies) {
            if (winningStrategy.checkWinner(board, lastMove)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if (row >= board.getSize()) {
            return false;
        }

        if (col >= board.getSize()) {
            return false;
        }

        if (board.getBoard().get(row).get(col).getCellState() != CellState.EMPTY) {
            return false;
        }

        return true;
    }

    public Optional<Move> undo() {
        if (moves.isEmpty()) {
            System.out.println("No moves to undo!");
            return Optional.empty();
        }

        Move lastMove = moves.get(moves.size() - 1);
        moves.remove(lastMove);

        lastMove.getCell().reset();

        nextPlayerMoveIndex = (nextPlayerMoveIndex + players.size() - 1) % players.size();

        winningStrategies.forEach(winningStrategy -> winningStrategy.handleUndo(board, lastMove));

        return Optional.of(lastMove);
    }

    public static class GameBuilder {
        private int size;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public GameBuilder() {
            this.size = 0;
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
        }

        public GameBuilder setSizeOfBoard(int size) {
            this.size = size;
            return this;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public GameBuilder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public GameBuilder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public GameBuilder addWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategies.add(winningStrategy);
            return this;
        }

        public Game build() throws MoreThanOneBotException, PlayerAndDimensionMismatchException, DuplicateSymbolException {
            validate();
            return new Game(size, players, winningStrategies);
        }

        private void validate() throws MoreThanOneBotException, PlayerAndDimensionMismatchException, DuplicateSymbolException {
            validateBot();
            validatePlayerAndDimension();
            validateSymbols();
        }

        private void validateSymbols() throws DuplicateSymbolException {
            long count = this.players.stream()
                    .map(Player::getSymbol)
                    .map(Symbol::getCharacter)
                    .distinct()
                    .count();

            if (this.players.size() != count) {
                throw new DuplicateSymbolException();
            }
        }

        private void validatePlayerAndDimension() throws PlayerAndDimensionMismatchException {
            if (this.players.size() != size - 1) {
                throw new PlayerAndDimensionMismatchException();
            }
        }

        private void validateBot() throws MoreThanOneBotException {
            long count = this.players.stream()
                    .filter(player -> player.getType() == PlayerType.BOT)
                    .count();

            if (count > 1) {
                throw new MoreThanOneBotException(String.format("Found %s bots", count));
            }
        }
    }
}
