package com.example.DesafiosSenac;

import java.util.Scanner;

public class DesafioDois {

    public static void main(String[] args) {
        String nomeum, nomedois, nometres;
        double precoum, precodois,precotres;
        Scanner ler = new Scanner(System.in);
        System.out.println("escreva o nome dos 3 produtos e seus precos");

        System.out.println("primeiro produto");
        nomeum = ler.nextLine();
        System.out.println("preco");
        precoum = ler.nextDouble();
        ler.nextLine();

        System.out.println("segundo produto");
        nomedois = ler.nextLine();
        System.out.println("preco");
         precodois = ler.nextDouble();
        ler.nextLine();

        System.out.println("terceiro produto");
        nometres = ler.nextLine();
        System.out.println("preco");
        precotres = ler.nextDouble();
        ler.nextLine();

        if( precoum < precodois && precoum < precotres) {
            System.out.println("O produto: " + nomeum + "\nValor: " + precoum);
        } else if(precodois < precoum && precodois < precotres) {
            System.out.println("O produto: " + nomedois +"\nValor: " + precodois);
        } else if (precotres < precoum && precotres < precodois) {
            System.out.println("O produto: " + nometres +"\nValor: " + precotres);

        }
    }
}

