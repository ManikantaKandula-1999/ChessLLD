package com.example.chesslld.models.Pieces;

import com.example.chesslld.models.Board.Cell;
import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Pieces.Strategy.*;

import java.util.List;

public class Pawn extends Piece implements ChessPiece{

    public Pawn(PieceName pieceName, Color color, String symbol) {
        super(pieceName, color, symbol);
        this.movementStrategies = List.of( new PawnHorizontalMovementStrategy(), new PawnVerticalMovementStrategy(),new DiagonalMovementStrategy());
    }

    @Override
    public boolean canMove(Cell startingCell, Cell endingCell, ChessBoard board) {
        return super.canMove(startingCell, endingCell, board);
    }

    @Override
    public List<Move> listPossibleMoves(Cell currentCell) {
        return null;
    }
}
