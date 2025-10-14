package PracticaPilasColasArraylist;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        String [] vector = {"Thiago", "Angel", "Taborda", "Son geis"};

        Queue<String> cola = new PriorityQueue<>();

        for (String Letra: vector){
            cola.add(Letra);
        }
        String Nombres = "";

        while (!cola.isEmpty()) {
            char First = cola.poll().charAt(0); //char representa un caracter
            Nombres += First + "";
        }

        System.out.println(Nombres);;
    }
}
