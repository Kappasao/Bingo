package com.company;

/**
 * Created by 46995932d on 03/02/2017.
 */
public class Jugador {

    private String nombre;
    private int numero;

    public Jugador(String nombre, int num) {
        this.nombre = nombre;
        this.numero = num;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNumero() {return numero;}

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", numero=" +numero +
                '}';
    }
}
