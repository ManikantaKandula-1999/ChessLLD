package com.example.chesslld.game;

import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Pieces.PieceName;
import com.example.chesslld.models.Players.ChessPlayer;

import java.util.ArrayDeque;
import java.util.List;

public class ChessGame extends BoardGame {

    ChessPlayer p1;
    ChessPlayer p2;

    public ChessGame(ChessBoard board, ChessPlayer p1, ChessPlayer p2) {
        super(board, new ArrayDeque<>(List.of(p1, p2)));
        this.p1 = p1;
        this.p2 = p2;
        BoardFactory.prepareBoardByPlacingPieces(board);
    }

    @Override
    public void showBoard() {
        this.board.displayBoard();
    }

    @Override
    public boolean isGameOver() {
        boolean isWhiteKingDead = p1.getPiece(PieceName.KING).isKilled();
        boolean isBlackKingDead = p2.getPiece(PieceName.KING).isKilled();
        return isWhiteKingDead || isBlackKingDead;
    }
}
