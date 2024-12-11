package scaler.lld3.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size) {
        this.size = size;
        board = initialiseBoard(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void display() {
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                Cell cell = board.get(i).get(j);
                char ch = cell.getCellState() == CellState.EMPTY ? ' ' : cell.getPlayer().getSymbol().getCharacter();
                System.out.print(String.format(" %s ", ch));

                if (j < size - 1) {
                    System.out.print("|");
                }
            }

            if (i < size - 1) {
                System.out.println();
                for (int p = 0; p < size; p++) {
                    System.out.print("----");
                }
            }
        }

        System.out.println("\n");
    }

    private List<List<Cell>> initialiseBoard(int size) {
        List<List<Cell>> board = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(new Cell(i, j));
            }
            board.add(row);
        }
        return board;
    }
}
