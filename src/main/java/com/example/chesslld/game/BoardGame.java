package com.example.chesslld.game;

import com.example.chesslld.models.Board.ChessBoard;
import com.example.chesslld.models.Pieces.Move;
import com.example.chesslld.models.Players.Player;

import java.util.Queue;

public abstract class BoardGame {
    protected final ChessBoard board;
    protected final Queue<Player>players;

    BoardGame(ChessBoard board, Queue<Player> players){
        this.board = board;
        this.players = players;
    }

    public abstract void showBoard();

    public abstract boolean isGameOver();

    public void startGame(){
        while(true){
            Player current = players.poll();
            Move move = current.makeMove();
            this.board.applyMove(move);

            if(isGameOver()){
                System.out.println("Game Over");
                System.out.println(current.getName() + " won!");
                break;
            }
            players.add(current);
        }
    }
}
