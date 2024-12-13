package scaler.lld3.tictactoe.strategies.winningstrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Move;
import scaler.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {

    private final Map<Integer, Map<Symbol, Integer>> countOfSymbols;
    private final int a = 5;

    public RowWinningStrategy() {
        this.countOfSymbols = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        int row = lastMove.getCell().getRow();
        Symbol symbol = lastMove.getPlayer().getSymbol();

        Map<Symbol, Integer> symbolCounts = countOfSymbols.getOrDefault(row, new HashMap<>());
        symbolCounts.put(symbol, symbolCounts.getOrDefault(symbol, 0) + 1);
        countOfSymbols.put(row, symbolCounts);


        return symbolCounts.get(symbol) == board.getSize();
    }

    @Override
    public void handleUndo(Board board, Move undoMove) {
        int row = undoMove.getCell().getRow();
        Symbol symbol = undoMove.getPlayer().getSymbol();

        Map<Symbol, Integer> symbolCounts = countOfSymbols.get(row);
        symbolCounts.put(symbol, symbolCounts.get(symbol) - 1);
    }
}
