package com.example.chesslld.models.Pieces;

import com.example.chesslld.models.Board.Cell;
import com.example.chesslld.models.Board.ChessBoard;

import java.util.List;

public interface ChessPiece {
    void makeMove(Cell startCell, Cell endCell, ChessBoard board);
    void setKilled(boolean killed);
    boolean isKilled();
    boolean canMove(Cell startCell, Cell endCell, ChessBoard board);
    List<Move> listPossibleMoves(Cell cell);
    boolean isMovingFirstTime();
    Color getColor();
    String getPieceSymbol();
}
