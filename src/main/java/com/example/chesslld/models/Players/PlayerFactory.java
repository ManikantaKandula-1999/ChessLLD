package com.example.chesslld.models.Players;

import com.example.chesslld.game.BoardFactory;
import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Pieces.ChessPiece;
import com.example.chesslld.models.Pieces.Color;
import com.example.chesslld.models.Pieces.PieceName;

import java.util.Map;

public class PlayerFactory {
    public static ChessPlayer createPlayer(String name, Color color, ChessBoard board){
        Map<PieceName, ChessPiece> pieces = (color == Color.WHITE) ? BoardFactory.prepareWhitePieces() : BoardFactory.prepareBlackPieces();
        return new HumanChessPlayer(name, pieces, board);
    }
}
