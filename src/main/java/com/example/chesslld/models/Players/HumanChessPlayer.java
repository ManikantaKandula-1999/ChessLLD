package com.example.chesslld.models.Players;

import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Pieces.ChessPiece;
import com.example.chesslld.models.Pieces.Move;
import com.example.chesslld.models.Pieces.PieceName;

import java.util.Map;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer{

    public HumanChessPlayer(String name, Map<PieceName, ChessPiece> pieces, ChessBoard board){
        super(name, pieces, board);
    }

    @Override
    public Move makeMove() {
        this.getBoard().displayBoard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source row and column of the piece you want to move: ");
        int row = scanner.nextInt();
        char col = scanner.next().charAt(0);

        if(!this.getBoard().getBoard().get(row).get(col-'a').hasPiece()){
            throw new IllegalArgumentException("Invalid move");
        }

        System.out.println("Enter the destination row and column of the piece you want to move: ");
        int destRow = scanner.nextInt();
        char destCol = scanner.next().charAt(0);

        ChessPiece piece = this.getBoard().getBoard().get(row).get(col-'a').getPiece().get();

        if(!piece.canMove(this.getBoard().getBoard().get(row).get(col-'a'), this.getBoard().getBoard().get(destRow).get(destCol-'a'), this.getBoard())){
            throw new IllegalArgumentException("Invalid move");
        }
        return new Move(this.getBoard().getBoard().get(row).get(col-'a'), this.getBoard().getBoard().get(destRow).get(destCol-'a'));
    }
}
