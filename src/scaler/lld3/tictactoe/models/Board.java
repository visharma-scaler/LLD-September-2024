package scaler.lld3.tictactoe.models;

import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> grid;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }
}
