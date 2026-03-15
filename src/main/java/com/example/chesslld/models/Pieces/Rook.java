package com.example.chesslld.models.Pieces;

import com.example.chesslld.models.Board.Cell;
import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Pieces.Strategy.HorizontalMovementStrategy;
import com.example.chesslld.models.Pieces.Strategy.VerticalMovementStrategy;

import java.util.List;

public class Rook extends Piece implements ChessPiece{

    public Rook(PieceName pieceName, Color color, String symbol) {
        super(pieceName, color, symbol);
        this.movementStrategies = List.of( new HorizontalMovementStrategy(), new VerticalMovementStrategy());
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
