package com.snake_and_ladder.model;

import static com.snake_and_ladder.OutputWriter.print;
import static com.snake_and_ladder.OutputWriter.printWithNewLine;

public class Player {
    private final String name;
    private int position;
    private final Board board;

    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
        this.position = 0;
    }

    public void move() {
        int dice = Dice.rollDice();
        int newPosition = dice + position;
        if (newPosition <= board.getSize()) {
            print(name + " rolled a " + dice + " and moved from " + position + " to ");
            position = board.getCellPosition(newPosition);
            printWithNewLine(position);
            if (position == board.getSize()) {
                printWithNewLine("************ " + name + " has just won the game ***********");
            }
        } else {
            print(name + " rolled a " + dice + " but cannot move outside board");
        }
    }

    public boolean hasWon() {
        return board.getSize() == position;
    }
}
