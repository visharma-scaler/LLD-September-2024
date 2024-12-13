package scaler.lld3.tictactoe.strategies.winningstrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Move;
import scaler.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy {

    private final Map<Integer, Map<Symbol, Integer>> countOfSymbols;

    public ColumnWinningStrategy() {
        this.countOfSymbols = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        int col = lastMove.getCell().getCol();
        Symbol symbol = lastMove.getPlayer().getSymbol();

        Map<Symbol, Integer> symbolCounts = countOfSymbols.getOrDefault(col, new HashMap<>());
        symbolCounts.put(symbol, symbolCounts.getOrDefault(symbol, 0) + 1);
        countOfSymbols.put(col, symbolCounts);


        return symbolCounts.get(symbol) == board.getSize();
    }

    @Override
    public void handleUndo(Board board, Move undoMove) {
        int col = undoMove.getCell().getCol();
        Symbol symbol = undoMove.getPlayer().getSymbol();

        Map<Symbol, Integer> symbolCounts = countOfSymbols.get(col);
        symbolCounts.put(symbol, symbolCounts.get(symbol) - 1);
    }
}

// [0] -> {X: 1, O: 0}
// [1] -> {X: 2, O: 1}
// [2] -> {X: 1, O: 2}
// [3] -> {X: 1, O: 1}

