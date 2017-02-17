package com.company;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by 46995932d on 03/02/2017.
 */
public class GameState {


    private Line numeroJugador1;
    private Line numeroJugador2;


    public GameState() {
        initPlayerLineas();
    }

    public void initPlayerLineas() {

        this.numeroJugador1 = new Line();

        while (true) {

            this.numeroJugador2 = new Line();
            if (!numeroJugador1.equals(numeroJugador2)) {
                break;
            }

        }
    }


    public void checkNumber(int num) {

        if (numeroJugador1.checkNumeros(num)){
        }
        if (numeroJugador2.checkNumeros(num)){
        }
    }

    public boolean seAcabo() {
        if (numeroJugador1.lineaCompleta() || numeroJugador2.lineaCompleta()){
            return true;
        }
        else {
            return false;
        }
    }

    public Integer getGanador(){
        if (numeroJugador1.lineaCompleta()){
            return 1;
        }
        else if (numeroJugador2.lineaCompleta()){
            return 2;
        }
        else {
            return 0;
        }
    }

    public Line getLineJugador1() {return numeroJugador1;}
    public Line getLineJugador2() {return numeroJugador2;}


}
