package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public boolean check = false;

    public static void main(String[] args) {
        ArrayList<String> listaParole = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il numero di parole che vuoi inserire: ");


        int nParole = scan.nextInt();

        String parola;
        for (int i = 0; i <= nParole; i++){
            parola = scan.nextLine();
            listaParole.add(parola);
        }

        Parole p = new Parole(listaParole);

        //scelgo una parola random e la mostro nella console (per capire se fan giusto)
        String parolaMisteriosa = p.ScegliParola();
        System.out.println("parola misteriosa: " + parolaMisteriosa);

        //creo i thread con la parola random, la lista delle parole che devono pescare e il loro nome
        Indovina t1 = new Indovina(parolaMisteriosa, listaParole, "1");
        Indovina t2 = new Indovina(parolaMisteriosa, listaParole, "2");

        //faccio partire i thread
        t1.run();
        t2.run();
    }
}
