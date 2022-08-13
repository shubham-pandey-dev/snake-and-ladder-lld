package com.snake_and_ladder.model;

public class Player {
    private final String name;
    private int position;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        int newPosition = Dice.rollDice() + position;
        position = Board.getCellPosition(newPosition);
    }
}
