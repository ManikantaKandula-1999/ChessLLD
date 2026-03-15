package com.example.chesslld.models.Pieces;

import com.example.chesslld.models.Board.Cell;
import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Board.Direction;
import com.example.chesslld.models.Pieces.Strategy.MovementStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private final PieceName pieceName;
    private final Color color;
    private final String pieceSymbol;
    protected boolean killed;
    protected List<Move> moves;
    protected List<MovementStrategy> movementStrategies;

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
        return movementStrategies.stream().anyMatch(strategy -> strategy.canMove(startCell, endCell, board));
    }

    public void makeMove(Cell startCell, Cell endCell, ChessBoard board){
        ChessPiece currentPiece = startCell.getPiece().get();
        startCell.removePiece();

        if(endCell.getPiece().isPresent()){
            ChessPiece piece = endCell.getPiece().get();
            piece.setKilled(true);
        }
        endCell.setPiece(currentPiece);
    }

    public boolean isMovingFirstTime(){
        return moves.isEmpty();
    }

    public boolean isMovingHorizontally(Cell startCell, Cell endCell){
        return startCell.getHorizontalDistance(endCell) == 1 && startCell.getVerticalDistance(endCell) == 0;
    }

    public boolean isMovingVertically(Cell startCell, Cell endCell){
        return startCell.getVerticalDistance(endCell) == 1 && startCell.getHorizontalDistance(endCell) == 0;
    }

    public boolean isMovingDiagonally(Cell startCell, Cell endCell){
        return startCell.getHorizontalDistance(endCell) == 1 && startCell.getVerticalDistance(endCell) == 1;
    }

    protected Direction getDirection(Cell startCell, Cell endCell){
        int x = endCell.getX() - startCell.getX();
        int y = endCell.getY() - startCell.getY();
        if (x == 0 && y == 0) return Direction.NONE;

        if(x ==0){
            return y>0 ? Direction.FORWARD_Y : Direction.BACKWARD_Y;
        }

        if(y ==0){
            return x>0 ? Direction.FORWARD_X : Direction.BACKWARD_X;
        }

        if(x == 1 && y == 1){
            return Direction.DIAGONAL_FORWARD_RIGHT;
        }

        if(x == 1 && y == -1){
            return Direction.DIAGONAL_BACKWARD_RIGHT;
        }

        if(x == -1 && y == 1){
            return Direction.DIAGONAL_FORWARD_LEFT;
        }
        if(x == -1 && y == -1){
            return Direction.DIAGONAL_BACKWARD_LEFT;
        }
        return Direction.NONE;
    }

}
