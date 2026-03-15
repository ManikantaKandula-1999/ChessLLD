package com.example.chesslld.models.Pieces.Strategy;

import com.example.chesslld.models.Board.Cell;
import com.example.chesslld.models.Board.ChessBoard;

public class PawnVerticalMovementStrategy implements MovementStrategy{
    public boolean canMove(Cell startCell, Cell endCell, ChessBoard board) {
        return true;
    }
}
