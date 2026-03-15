package com.example.chesslld;

import com.example.chesslld.game.BoardGame;
import com.example.chesslld.game.GameFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChessLldApplication {

    public static void main(String[] args) {

        SpringApplication.run(ChessLldApplication.class, args);
        BoardGame game = GameFactory.createGame();
        game.startGame();
    }

}
