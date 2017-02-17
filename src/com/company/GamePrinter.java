package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 46995932d on 17/02/2017.
 */
public class GamePrinter {

    public static String LeerNombre(int playerNum){

        Scanner scanner = new Scanner(System.in);

        if (playerNum == 1){
            System.out.println("Nombre del jugador 1:");
            return scanner.nextLine();
        }
        if (playerNum == 2){
            System.out.println("Nombre del jugador 2:");
            return scanner.nextLine();
        }
        return null;
    }

    public static void printNumerosJugadores(GameState game, Jugador player1, Jugador player2){

        System.out.println(player1.getNombre() + " tu linea sera: " + game.getLineJugador1());
        System.out.println(player2.getNombre() + " tu linea sera: " + game.getLineJugador2());

    }
    public static void printNumero (Integer num){

        System.out.println("El numero es: " + num);
        System.out.println("Pulsa enter para continuar.");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void printGanador (Integer playerNumber, Jugador player1, Jugador player2){

        if (playerNumber == 1){
            System.out.println("El ganador es  " + player1.getNombre());
        }else {
            System.out.println("El ganador es " + player2.getNombre());
        }

    }
    public static void printMovimiento(GameState game, Jugador player1, Jugador player2) {
        System.out.println(player1.getNombre() + " tu linea es  " +game.getLineJugador1());
        System.out.println(player2.getNombre()+ " tu linea es " + game.getLineJugador2());
    }


}
