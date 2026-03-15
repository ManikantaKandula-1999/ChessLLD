package com.example.chesslld.models.Pieces;

import com.example.chesslld.models.Board.Cell;
import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Pieces.Strategy.KnightMovementStrategy;

import java.util.List;

public class Knight extends Piece implements ChessPiece{

    public Knight(PieceName pieceName, Color color, String symbol) {
        super(pieceName, color, symbol);
        this.movementStrategies = List.of( new KnightMovementStrategy());
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
