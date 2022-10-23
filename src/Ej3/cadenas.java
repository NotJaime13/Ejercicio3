package Ej3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class cadenas {
    public static void main(String[] args) {
        System.out.println("Indica el numero de palabras que desea imprimir: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i= 0; i<n; i++) {
            System.out.println(i+1 +"- " + generaPalabras(n));
        }
    }

    public static String generaPalabras(int n){
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        int rand = (int)(Math.random()*20);
        String cadena = "";

            for (int x = 0; x < rand; x++) {
                int indiceAleatorio = numeroAleatorioEnRango(0, alfabeto.length() - 1);
                char caracteraleatorio = alfabeto.charAt(indiceAleatorio);
                cadena += caracteraleatorio;
            }
            return cadena;
    }

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
