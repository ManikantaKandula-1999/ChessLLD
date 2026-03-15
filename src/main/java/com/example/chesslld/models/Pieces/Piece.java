package com.example.chesslld.models.Pieces;

import com.example.chesslld.models.Board.Cell;
import com.example.chesslld.models.Board.ChessBoard;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private final PieceName pieceName;
    private final Color color;
    private final String pieceSymbol;
    protected boolean killed;
    protected List<Move> moves;

    public Piece(PieceName pieceName, Color color, String pieceSymbol) {
        this.pieceName = pieceName;
        this.color = color;
        this.pieceSymbol = pieceSymbol;
        this.killed = false;
        this.moves = new ArrayList<>();
    }

    public PieceName getPieceName() {
        return this.pieceName;
    }

    public Color getColor() {
        return this.color;
    }
    public String getPieceSymbol() {
        return this.pieceSymbol;
    }

    public String getColorSymbol() {
        return this.color == Color.WHITE ? "W" : "B";
    }

    public boolean isKilled() {
        return this.killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public List<Move> getMoves() {
        return this.moves;
    }

    public boolean canMove(Cell startCell, Cell endCell, ChessBoard board){
        return true;
    }

    public void makeMove(Cell startCell, Cell endCell, ChessBoard board){

    }

}
