package com.example.chesslld.game;

import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Pieces.Color;
import com.example.chesslld.models.Players.ChessPlayer;
import com.example.chesslld.models.Players.PlayerFactory;

public class GameFactory {

    public static ChessGame createGame(){
        ChessBoard board = new ChessBoard();
        ChessPlayer p1 = PlayerFactory.createPlayer("Mani", Color.WHITE, board);
        ChessPlayer p2 = PlayerFactory.createPlayer("Kanta", Color.BLACK, board);
        return new ChessGame(board, p1, p2);
    }
}
