package com.example.chesslld.models.Board;

import com.example.chesslld.models.Pieces.ChessPiece;
import com.example.chesslld.models.Pieces.Move;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard implements Board{
    private final List<List<Cell>> board;

    public ChessBoard(){
        this.board = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                row.add(new Cell(i, (char) (j + 'a')));
            }
            this.board.add(row);
        }
    }

    @Override
    public void displayBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(board.get(i).get(j).hasPiece()){
                    System.out.print(board.get(i).get(j).getPiece().get().getPieceSymbol() + " | ");
                }else{
                    System.out.print("___ | ");
                }
            }
            System.out.println(" ");
        }
    }

    @Override
    public void applyMove(Move move){
        int sourceRow = move.getSourceCell().getX();
        int sourceColumn = move.getSourceCell().getY();

        ChessPiece piece = board.get(sourceRow).get(sourceColumn-'a').getPiece().get();
        piece.makeMove(move.getSourceCell(), move.getDestinationCell(), this);
    }

    @Override
    public void setPiece(ChessPiece piece, int row, char column){
        board.get(row).get(column-'a').setPiece(piece);
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
}
