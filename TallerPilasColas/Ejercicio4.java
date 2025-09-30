import java.util.*;

public class Ejercicio4 {
    public static String formatearTelefono(int[] digitos) {
        Queue<Integer> cola = new LinkedList<>();
        for (int d : digitos) cola.add(d);

        String telefono = "(";
        for (int i = 0; i < 3; i++) telefono += cola.poll();
        telefono += ") ";
        for (int i = 0; i < 3; i++) telefono += cola.poll();
        telefono += "-";
        for (int i = 0; i < 4; i++) telefono += cola.poll();

        return telefono;
    }

    public static void main(String[] args) {
        System.out.println(formatearTelefono(new int[]{1,2,3,4,5,6,7,8,9,0}));
        // (123) 456-7890

        System.out.println(formatearTelefono(new int[]{3,0,0,1,2,3,4,5,6,7}));
        // (300) 123-4567
    }
}

