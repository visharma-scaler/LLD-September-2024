package scaler.lld3.tictactoe.controllers;

import scaler.lld3.tictactoe.exceptions.DuplicateSymbolException;
import scaler.lld3.tictactoe.exceptions.MoreThanOneBotException;
import scaler.lld3.tictactoe.exceptions.PlayerAndDimensionMismatchException;
import scaler.lld3.tictactoe.models.Game;
import scaler.lld3.tictactoe.models.GameState;
import scaler.lld3.tictactoe.models.Move;
import scaler.lld3.tictactoe.models.Player;
import scaler.lld3.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.List;
import java.util.Optional;

public class GameController {

    public Game startGame(int sizeOfBoard, List<Player> players, List<WinningStrategy> winningStrategies) throws DuplicateSymbolException, PlayerAndDimensionMismatchException, MoreThanOneBotException {
        return Game.builder()
                .setSizeOfBoard(sizeOfBoard)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
//                .addPlayer(new Player())
//                .addPlayer(new Player())
//                .addWinningStrategy(winningStrategies.get(0))
//                .addWinningStrategy(winningStrategies.get(1))
                .build();
    }

    public GameState getGameState(Game game) {
        return game.getState();
    }

    public void displayBoard(Game game) {
        game.display();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public Optional<Move> undo(Game game) {
        return game.undo();
    }
}