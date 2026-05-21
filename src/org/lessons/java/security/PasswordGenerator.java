package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        String nome;
        String cognome;
        String colorePreferito;
        int giorno;
        int mese;
        int anno;

        Scanner in = new Scanner(System.in);

        nome = in.nextLine();
        cognome = in.nextLine();
        colorePreferito = in.nextLine();
        giorno = in.nextInt();
        mese = in.nextInt();
        anno = in.nextInt();

        int sommaDataDiNascita = giorno + mese + anno;
        String passwordGenearata = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataDiNascita;

        System.out.println("la tua password è " + passwordGenearata);

    }
}
