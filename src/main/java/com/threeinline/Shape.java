package com.threeinline;

import java.util.Random;

public enum Shape {
    ROCK,
    PAPER,
    SCISSORS;

    private static final Random RANDOM = new Random();

    public int playPaperRockScissors() {
        int result;
        Shape anotherShape = randomShape();
        if (this == ROCK) {
            result = isWinnerVersusRock(anotherShape);
        } else if (this == PAPER) {
            result = isWinnerVersusPaper(anotherShape);
        } else {
            result = isWinnerVersusScissors(anotherShape);
        }
        return result;
    }

    private int isWinnerVersusRock(Shape anotherShape) {
        if (anotherShape == PAPER) {
            return -1;
        } else if (anotherShape == ROCK) {
            return 0;
        } else {
            return 1;
        }
    }

    private int isWinnerVersusPaper(Shape anotherShape) {
        if (anotherShape == PAPER) {
            return 0;
        } else if (anotherShape == ROCK) {
            return 1;
        } else {
            return -1;
        }
    }

    private int isWinnerVersusScissors(Shape anotherShape) {
        if (anotherShape == PAPER) {
            return 1;
        } else if (anotherShape == ROCK) {
            return -1;
        } else {
            return 0;
        }
    }

    public static Shape randomShape()  {
        Shape[] shapes = values();
        return shapes[RANDOM.nextInt(shapes.length)];
    }
}
