package com.example.compra_comida;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteArquivo {
    public static void main(String[] args) {
        System.out.println("Leitura do arquivo");

        File file = new File("C:\\Users\\gustavo.pereira12\\Documents");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("ERRO! " + e.getMessage());
        }finally{
            if ( sc != null){
                sc.close();
            }
        }
    }
}
