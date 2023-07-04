package com.example.compra_comida;

import java.util.Scanner;

public class comida {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Responda com S (SIM) ou N de (NAO)");
        System.out.println("voce esta com fome?");
        String comer = ler.nextLine();
        System.out.println("voce tem dinheiro para comer?");
        String dinheiro = ler.nextLine();

        if (comer.equals("S") && dinheiro.equals("S")) {
            System.out.println("Vá ate a tenda da Dona Maricreusa, ela vande uma comida muito boa");
        }else if (comer.equals("S") && dinheiro.equals("N")) {
            System.out.println("Va arrumar dinheiro e depois venha na cantina!");
        }else if (comer.equals("N") && dinheiro.equals("S")) {
            System.out.println("Entao nao coma rapaz!!");
        } else if (comer.equals("N") && dinheiro.equals("N")) {
            System.out.println("Entao se suma daqui e nao volte mais");
        }else{
            System.out.println("Digite outra opcao...");
        }
    }

    }

