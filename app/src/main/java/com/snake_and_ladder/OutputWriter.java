package com.snake_and_ladder;

public class OutputWriter {

    public static void print(Object object) {
        System.out.print(object);
    }

    public static void printWithNewLine(Object object) {
        System.out.println(object);
    }

    public static void print(Object ...objects) {
        for(Object o: objects) {
            System.out.println(o);
        }
    }
}
