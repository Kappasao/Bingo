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

        player1 = new Jugador("Alvaro");
        player2 = new Jugador("Kys");

        game.initPlayerNumbers();

        System.out.println("Jugador 1" +player1.getNombre()+" Le ha tocado el numero " +game.getPlayer1Num());
        System.out.println("Jugador 2" +player2.getNombre()+" Le ha tocado el numero " +game.getPlayer2Num());

        int result = 0;

        while (result == 0){

            int num = bombo.entregarNum();
            result = game.checkNumber(num);
        }

        if (result == 1){
            System.out.println("Ha ganado el jugador" +player1.getNombre());
        }
        else{
            System.out.println("Ha ganado el jugador" +player2.getNombre());
        }
    }


}
