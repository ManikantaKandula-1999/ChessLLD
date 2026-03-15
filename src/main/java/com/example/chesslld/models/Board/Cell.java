package com.example.chesslld.models.Board;

import com.example.chesslld.models.Pieces.ChessPiece;

import java.util.Optional;

public class Cell {
    private final Pair position;
    private Optional<ChessPiece> piece;

    public Cell(int x, char y) {
        this.position = new Pair(x, y);
        this.piece = Optional.empty();
    }

    public Pair getPosition() {
        return this.position;
    }

    public Optional<ChessPiece> getPiece() {
        return this.piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = Optional.of(piece);
    }

    public void removePiece() {
        this.piece = Optional.empty();
    }

    public boolean hasPiece() {
        return this.piece.isPresent();
    }

    public int getX() {
        return this.position.getX();
    }

    public char getY() {
        return this.position.getY();
    }

    public int getVerticalDistance(Cell cell) {
        return Math.abs(this.position.getY() - cell.position.getY());
    }

    public int getHorizontalDistance(Cell cell) {
        return Math.abs(this.position.getX() - cell.position.getX());
    }
}
