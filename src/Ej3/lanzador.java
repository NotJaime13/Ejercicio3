package Ej3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class lanzador {
    public static void main(String[] args) {
        String ruta = "C:\\temp\\Ej3\\out\\production\\Ej3\\Ej3.cadenas.class";
        lanzar(ruta);
        System.out.println("Finalizado");
    }

    public static void lanzar(String ruta){
        ProcessBuilder pb;
        try{
            File fich = new File("cadenass.txt");
            pb = new ProcessBuilder("java", "-classpath", ruta);
            pb.redirectOutput(ProcessBuilder.Redirect.appendTo(fich));
            pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
