package scaler.lld3.tictactoe.strategies.winningstrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Move;
import scaler.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {

    private final Map<Symbol, Integer> leftDiagonalSymbolCounts;
    private final Map<Symbol, Integer> rightDiagonalSymbolCounts;

    public DiagonalWinningStrategy() {
        this.leftDiagonalSymbolCounts = new HashMap<>();
        this.rightDiagonalSymbolCounts = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();
        Symbol symbol = lastMove.getPlayer().getSymbol();

        // left diagonal
        if (row == col) {
            leftDiagonalSymbolCounts.put(symbol, leftDiagonalSymbolCounts.getOrDefault(symbol, 0) + 1);
            if (leftDiagonalSymbolCounts.get(symbol) == board.getSize()) {
                return true;
            }
        }

        //right  diagonal
        if (row + col == board.getSize() - 1) {
            rightDiagonalSymbolCounts.put(symbol, rightDiagonalSymbolCounts.getOrDefault(symbol, 0) + 1);
            return rightDiagonalSymbolCounts.get(symbol) == board.getSize();
        }

        return false;
    }

    @Override
    public void handleUndo(Board board, Move undoMove) {
        int row = undoMove.getCell().getRow();
        int col = undoMove.getCell().getCol();
        Symbol symbol = undoMove.getPlayer().getSymbol();

        // left diagonal
        if (row == col) {
            leftDiagonalSymbolCounts.put(symbol, leftDiagonalSymbolCounts.get(symbol) - 1);
        }

        //right  diagonal
        if (row + col == board.getSize() - 1) {
            rightDiagonalSymbolCounts.put(symbol, rightDiagonalSymbolCounts.get(symbol) - 1);
        }

    }
}

/*


 X | O | X
-----------
   | X |
-----------
 X |   |

*/
