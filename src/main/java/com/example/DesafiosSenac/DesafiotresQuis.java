package com.example;

import java.util.Scanner;

public class DesafiotresQuis {
    public static void main(String[] args) {
        //Desafio um comida
        Scanner ler = new Scanner(System.in);
        String nomeJogador;
        String Quis1, Quis2, Quis3, Quis4;

        System.out.println("OLAAA! ESSE QUIS É SOBRE PERGUNTAS MANEIRAS!");
        System.out.println("DIGITE SEU NICK: ");
        nomeJogador = ler.nextLine();
        System.out.println("antes de começarmos o quis... vamos fazer um teste de logica " +nomeJogador);
        nomeJogador = ler.nextLine();
        System.out.println("SEJA BEM VINDO AO QUIS DE PERGUNTAS JOGADOR: \n" + nomeJogador);
        System.out.println("Clique 'ENTER' para iniciar o quis de perguntas!");
        nomeJogador = ler.nextLine();
        System.out.println("1- Quantos habitantes existem no Brasil? " +
                "\nA- 200,1 milhoes" +
                "\nB- 360,2 milhoes" +
                "\nC- 165,3 milhoes" +
                "\nD- 214,3 milhoes");
        Quis1 = ler.nextLine();
        if (Quis1.equals("D") || Quis1.equals("d")) {
            System.out.println("PARABENS!! VOCE ACERTOU.. VAMOS PARA A PROXIMA\n");
        } else {
            System.out.println("QUE PENA, RESPOSTA ERRADA.. MAIS SORTE NA PROXIMA\n");
        }

        System.out.println("EM QUAL ANO FOI A FILOSOFIA DE PASCAL" +
                "\nA- 1656-1657" +
                "\nB- 1985-1996" +
                "\nC- 1520-1586" +
                "\nD- 1680-1736");
        Quis2 = ler.nextLine();
        if (Quis2.equals("A") || Quis2.equals("a")) {
            System.out.println("PARABENS!! VOCE ACERTOU.. VAMOS PARA A PROXIMA\n");
        } else {
            System.out.println("QUE PENA, RESPOSTA ERRADA.. MAIS SORTE NA PROXIMA \n");
        }

        System.out.println("QUAL FOI A PESSOA MAIS IMPORTANTE PARA A HISTORIA DO BRASIL?" +
                "\nA- Pedro Alvares Cabral" +
                "\nB- Joaquin Nabuco" +
                "\nC- Luiz Inacio Lula da Silva" +
                "\nD- José Bonafacio");
        Quis3 = ler.nextLine();
        if (Quis3.equals("B") || Quis3.equals("b")) {
            System.out.println("PARABENS!! VOCE ACERTOU.. VAMOS PARA A PROXIMA\n");
        } else {
            System.out.println("QUE PENA, RESPOSTA ERRADA.. MAIS SORTE NA PROXIMA\n");

            System.out.println("EM QUE ANO COMECOU AS INVENCOES DA PROGRAMACAO" +
                    "\nA- 1650" +
                    "\nB- 1686" +
                    "\nC- 1837" +
                    "\nD- 1965");
            Quis4 = ler.nextLine();
            if (Quis4.equals("C") || Quis4.equals("c")){ ;
                System.out.println("PARABENS!! VOCE ACERTOU A RESPOSTA!...FIM DO QUIS");
            }else{
                System.out.println("QUE PENA, RESPOSTA ERRADA.. FIM DO QUIS");
                System.out.println("Clique 'ENTER' para ver as respostas corretas do quis!");
                Quis4 = ler.nextLine();
                System.out.println("A sequencia de Respostas corretas são: D - A - B - C.");
            }
        }


    }
}
