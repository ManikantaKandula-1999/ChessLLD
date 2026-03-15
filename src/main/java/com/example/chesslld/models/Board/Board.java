package com.example.chesslld.models.Board;

import com.example.chesslld.models.Pieces.ChessPiece;
import com.example.chesslld.models.Pieces.Move;

public interface Board {

    void displayBoard();
    void applyMove(Move move);
    void setBoard(ChessPiece piece, int row, char column);
}
