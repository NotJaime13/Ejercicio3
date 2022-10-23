package Ej3;

import java.io.*;
import java.util.Scanner;

public class frecuencia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Indicame la frase a analizar: ");
        String frase = input.nextLine();
        contar(frase);
    }

    public static void contar(String frase) {
            char vocal = 0;
            int contadora = 0;
            int contadore = 0;
            int contadori = 0;
            int contadoro = 0;
            int contadoru = 0;
            for(int x=0;x<frase.length();x++) {
                    switch (frase.charAt(x)) {
                        case 'a':
                            contadora++;
                            break;
                        case 'e':
                            contadore++;
                            break;
                        case 'i':
                            contadori++;
                            break;
                        case 'o':
                            contadoro++;
                            break;
                        case 'u':
                            contadoru++;
                            break;
                    }
            }
            System.out.println("La frase contiene " + contadora + " As");
            System.out.println("La frase contiene " + contadore + " Es");
            System.out.println("La frase contiene " + contadori + " Is");
            System.out.println("La frase contiene " + contadoro + " Os");
            System.out.println("La frase contiene " + contadoru + " Us");
    }
}
