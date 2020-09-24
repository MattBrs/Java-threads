package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Indovina extends Thread{

    private String _parola;
    private ArrayList<String> _listaParole;
    private String _id;

    public Indovina(String parola, ArrayList<String> listaParole, String id){
        _listaParole = listaParole;
        _parola = parola;
        _id = id;
    }

    @Override
    public void run() {
        Random rnd = new Random();
        String p = _listaParole.get(rnd.nextInt(_listaParole.size()));
        int conta = 1;

        while(p.compareTo(_parola) != 0){
            System.out.println(_id + ": " + p);
            p = _listaParole.get(rnd.nextInt(_listaParole.size()));
            conta++;

        }
        System.out.println(_id + ": Indovinato! " + p);

    }


}
