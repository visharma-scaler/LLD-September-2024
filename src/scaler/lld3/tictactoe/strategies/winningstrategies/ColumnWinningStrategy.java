package scaler.lld3.tictactoe.strategies.winningstrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Cell;
import scaler.lld3.tictactoe.models.CellState;
import scaler.lld3.tictactoe.models.Move;

public class ColumnWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        int col = lastMove.getCell().getCol();
        int count = 0;
        for (int i = 0; i < board.getSize(); i++) {
            Cell cell = board.getBoard().get(i).get(col);
            if (cell.getCellState() == CellState.EMPTY) {
                continue;
            }

            if (cell.getPlayer().equals(lastMove.getPlayer())){
                count++;
            }
        }

        return count == board.getSize();
    }
}
