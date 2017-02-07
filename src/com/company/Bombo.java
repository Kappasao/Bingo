package com.company;
/**
 * Created by 46995932d on 03/02/2017.
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Bombo {

    private List <Integer> numeros = new ArrayList<>();

    public Bombo() {

        for (int i=0 ; i<10 ; i++){
            numeros.add(i);
        }

        Collections.shuffle(numeros);

    }

    public Integer entregarNum(){

        return numeros.remove(numeros.size()-1);

    }

    public boolean quedanNum(){

        return numeros.isEmpty();
    }

}
