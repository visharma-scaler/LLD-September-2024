package scaler.lld3.tictactoe.strategies.winningstrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move lastMove);

    void handleUndo(Board board, Move undoMove);
}
