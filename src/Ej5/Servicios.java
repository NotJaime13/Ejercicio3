package Ej5;
import java.io.*;
public class Servicios {
    public static void main(String[] args) {
        try {
            String comando []= {"cmd", "/c", "tasklist", "/fi", "\"SESSIONNAME eq Services\""};
            ProcessBuilder pb = new ProcessBuilder(comando);
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            copiarSalida(System.out, br);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private static void copiarSalida(PrintStream dest, BufferedReader orig) throws IOException {
        String line;
        while ((line = orig.readLine()) != null) {
            dest.println(line);
        }
    }
}