package com.example.chesslld.models.Players;

import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Pieces.ChessPiece;
import com.example.chesslld.models.Pieces.Move;
import com.example.chesslld.models.Pieces.PieceName;

import java.util.Map;

public class HumanChessPlayer extends ChessPlayer{

    public HumanChessPlayer(String name, Map<PieceName, ChessPiece> pieces, ChessBoard board){
        super(name, pieces, board);
    }

    @Override
    public Move makeMove() {
        return null;
    }
}
