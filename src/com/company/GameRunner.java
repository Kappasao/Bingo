package com.company;

/**
 * Created by 46995932d on 03/02/2017.
 */
public class GameRunner {

    private GameState game;
    private Jugador player1;
    private Jugador player2;
    private Bombo bombo;

    public void run(){

        game= new GameState();
        bombo = new Bombo();

        String player1Name = GamePrinter.LeerNombre(1);
        String player2Name = GamePrinter.LeerNombre(2);

        player1 = new Jugador(player1Name,1);
        player2 = new Jugador(player2Name,2);

        GamePrinter.printNumerosJugadores(game, player1 , player2);

        while (!game.seAcabo()){

            int num = bombo.entregarNum();
            game.checkNumber(num);
            GamePrinter.printNumero(num);
            GamePrinter.printMovimiento(game, player1, player2);


        }

        GamePrinter.printGanador(game.getGanador(), player1, player2);

    }
}
