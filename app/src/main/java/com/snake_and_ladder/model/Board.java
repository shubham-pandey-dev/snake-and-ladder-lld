package com.snake_and_ladder.model;

public class Board {
    private Cell[] cells;

    public Board(int size) {
        cells = new Cell[size + 1];
        for (int cell = 1; cell < size; cell += 1) {
            cells[cell] = new Cell(cell);
        }
    }

    public int getCellPosition(int position) {
        return cells[position].processSnakeAndLadder().getNumber();
    }

    public void addSnake(int from, int to) {
        cells[from].setSnake(cells[to]);
    }

    public void addLadder(int from, int to) {
        cells[from].setLadder(cells[to]);
    }
}
