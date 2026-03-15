package com.example.chesslld.models.Board;

public class Pair {
    private final int x;
    private final char y;

    public Pair(int x, char y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public char getY() {
        return this.y;
    }
}
