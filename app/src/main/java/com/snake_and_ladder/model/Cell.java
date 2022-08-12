package com.snake_and_ladder.model;

public class Cell {
    int number;
    Cell snake;
    Cell ladder;

    public Cell(int number) {
        this.number = number;
        this.snake = null;
        this.ladder = null;
    }

    public Cell(int number, Cell snake, Cell ladder) {
        this.number = number;
        this.snake = snake;
        this.ladder = ladder;
    }
}
