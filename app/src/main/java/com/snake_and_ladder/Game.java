package com.snake_and_ladder;

import com.snake_and_ladder.model.Board;

import java.util.Scanner;

import static com.snake_and_ladder.OutputWriter.print;
import static com.snake_and_ladder.OutputWriter.printWithNewLine;

public class Game {
    private Board board;
    private Scanner scanner;

    public void startSnakeAndLadder() {
        scanner = new Scanner(System.in);
        printWithNewLine("Starting Snake and Ladder game: ");

        initializeBoard();
        initializeSnakes();
        initializeLadders();

    }

    private void initializeBoard() {
        print("Enter Board Size: ");
        int size = scanner.nextInt();
        board = new Board(size);
    }

    private void initializeSnakes() {
        print("Enter Number of Snakes: ");
        int noOfSnakes = scanner.nextInt();
        for (int snake = 1; snake <= noOfSnakes; snake += 1) {
            int snakeStartAt = scanner.nextInt();
            int snakeEndAt = scanner.nextInt();
            board.addSnake(snakeStartAt, snakeEndAt);
        }
    }

    private void initializeLadders() {
        print("Enter Number of Ladders: ");
        int noOfLadders = scanner.nextInt();
        for (int ladder = 1; ladder <= noOfLadders; ladder += 1) {
            int ladderStartAt = scanner.nextInt();
            int ladderEndAt = scanner.nextInt();
            board.addLadder(ladderStartAt, ladderEndAt);
        }
    }
}
