package com.snake_and_ladder;

import com.snake_and_ladder.model.Board;
import com.snake_and_ladder.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.snake_and_ladder.OutputWriter.print;
import static com.snake_and_ladder.OutputWriter.printWithNewLine;

public class Game {
    private Board board;
    private Scanner scanner;
    private List<Player> players;

    public void startSnakeAndLadder() {
        scanner = new Scanner(System.in);
        printWithNewLine("Starting Snake and Ladder game: ");

        initializeBoard();
        initializeSnakes();
        initializeLadders();
        initializePlayers();

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

    private void initializePlayers() {
        print("Enter Number of Players: ");
        int noOfPlayers = scanner.nextInt();
        players = new ArrayList<>();
        for (int player = 1; player <= noOfPlayers; player += 1) {
            String name = scanner.next();
            players.add(new Player(name));
        }
    }
}
