package scaler.lld3.tictactoe.models;

import scaler.lld3.tictactoe.exceptions.DuplicateSymbolException;
import scaler.lld3.tictactoe.exceptions.MoreThanOneBotException;
import scaler.lld3.tictactoe.exceptions.PlayerAndDimensionMismatchException;
import scaler.lld3.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState state;
    private int nextPlayerMoveIndex;
    private List<WinningStrategy> winningStrategies;

    private Game(int size, List<Player> players, List<WinningStrategy> winningStrategies) {
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
            validateBot();
            validatePlayerAndDimension();
            validateSymbols();
            return new Game(size, players, winningStrategies);
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
