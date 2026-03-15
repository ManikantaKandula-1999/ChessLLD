package com.example.chesslld.models.Players;

import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Pieces.ChessPiece;
import com.example.chesslld.models.Pieces.PieceName;

import java.util.Map;

public abstract class ChessPlayer extends Player {

    private final Map<PieceName, ChessPiece> pieces;
    private final ChessBoard board;

    public ChessPlayer(String name, Map<PieceName, ChessPiece> pieces, ChessBoard board) {
        super(name);
        this.pieces = pieces;
        this.board = board;
    }

    public Map<PieceName, ChessPiece> getPieces() {
        return this.pieces;
    }

    public ChessBoard getBoard() {
        return this.board;
    }

    public ChessPiece getPiece(PieceName pieceName) {
        if(pieces.containsKey(pieceName) && pieces.get(pieceName).isKilled()){
            pieces.remove(pieceName);
        }

        if(!pieces.containsKey(pieceName)){
            return null;
        }

        return pieces.get(pieceName);
    }
}
