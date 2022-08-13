package com.snake_and_ladder.model;

public class Board {
    private final int size;
    static private Cell[] cells;

    public Board(int size) {
        this.size = size;
        cells = new Cell[size + 1];
    }

    public static int getCellPosition(int position) {
        return cells[position].processSnakeAndLadder().getNumber();
    }
}
