package com.snake_and_ladder.model;

public class Board {
    private final int size;
    private Cell[] board;

    public Board(int size) {
        this.size = size;
        board = new Cell[size + 1];
    }
}
