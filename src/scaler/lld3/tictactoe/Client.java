package scaler.lld3.tictactoe;

import scaler.lld3.tictactoe.controllers.GameController;
import scaler.lld3.tictactoe.exceptions.DuplicateSymbolException;
import scaler.lld3.tictactoe.exceptions.MoreThanOneBotException;
import scaler.lld3.tictactoe.exceptions.PlayerAndDimensionMismatchException;
import scaler.lld3.tictactoe.models.*;
import scaler.lld3.tictactoe.strategies.winningstrategies.ColumnWinningStrategy;
import scaler.lld3.tictactoe.strategies.winningstrategies.RowWinningStrategy;
import scaler.lld3.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class Client {
    public static void main(String[] args) throws DuplicateSymbolException, PlayerAndDimensionMismatchException, MoreThanOneBotException {

        GameController gameController = new GameController(); // singleton

        int sizeOfBoard = 3;

        List<Player> players = List.of(
                new Player(1L, "Vishal", new Symbol('X'), PlayerType.HUMAN),
                new Bot(2L, "GPT", new Symbol('O'), BotDifficultyLevel.EASY)
        );

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColumnWinningStrategy()
        );


        Game game = gameController.startGame(sizeOfBoard, players, winningStrategies);

        while (gameController.getGameState(game).equals(GameState.IN_PROGRESS)) {
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }


        if (gameController.getGameState(game).equals(GameState.DRAW)) {
            System.out.println("Game has been drawn");
        } else {
            System.out.println("The winner is:- " + gameController.getWinner(game).getName());
        }
    }
}


// Tic-Tac-Toe

// create the players
// start a game
// make a move

/*

        Welcome to the Tic-Tac-Toe Game !

// game details



 X | O | X
-----------
   |   |
-----------
 O |   |


// X's turn
// take inputs from the players

// continue for the next player


 X | O | X
-----------
   |   |
-----------
   |   | X


// O's turn
// take inputs from the players





Game will end once we have winner or draw !

*/

// Break till 08:30 AM