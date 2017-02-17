package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Line {

    private List<Integer> numeros =new ArrayList<>();

    public Line() {

        for (int i = 1; i<=4; i++){
            while (true){
                int  NumeroAleatorio = ThreadLocalRandom.current().nextInt(0,10);

                if (!numeros.contains(NumeroAleatorio)){
                    numeros.add(NumeroAleatorio);
                    break;
                }
            }
        }



    }

    public boolean checkNumeros(Integer numero){
        if (numeros.contains(numero)){
            numeros.remove(numero);
            return true;
        }
        return false;
        //Este metodo chquea si un number pasado como parametro si el parametro esta presente en el array list
        // Si esta presente actualiza el array de aciertos/hits
    }

    public boolean lineaCompleta() {
        return numeros.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        return numeros != null ? numeros.equals(line.numeros) : line.numeros == null;
    }

    @Override
    public int hashCode() {
        return numeros != null ? numeros.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "numeros=" + numeros +
                '}';
    }


}
