package com.company;


import java.util.ArrayList;
import java.util.Random;

public class Parole {
    private ArrayList<String> _parole;

    public Parole(ArrayList<String> parole){
        _parole = new ArrayList<String>();
        _parole = parole;
    }

    public String ScegliParola(){
        String parola;
        Random rnd = new Random(10);

        parola = _parole.get(rnd.nextInt(_parole.size()));
        return parola;
    }

}
