package com.snake_and_ladder.model;

public class Dice {
    private static final int start = 1;
    private static final int end = 6;

    /**
     * @return a random number within range start to end.
     */
    public static int rollDice() {
        return (int) ((Math.random() * end) + start);
    }
}
