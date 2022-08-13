package com.snake_and_ladder.model;

public class Cell {
    private final int number;
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

    public Cell processSnakeAndLadder() {
        return this.processSnake().processLadder();
    }

    private Cell processSnake() {
        Cell cell = this;
        while(cell.snake != null) {
            cell = cell.snake;
        }
        return cell;
    }

    private Cell processLadder() {
        Cell cell = this;
        while(cell.ladder != null) {
            cell = cell.ladder;
        }
        return cell;
    }

    public int getNumber() {
        return number;
    }
}
