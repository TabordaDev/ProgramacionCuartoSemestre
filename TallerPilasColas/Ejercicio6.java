import java.util.*;

public class Ejercicio6 {
    public static String sociedadSecreta(List<String> nombres) {
        // 1. Pasamos los nombres a una cola
        Queue<String> cola = new LinkedList<>(nombres);

        // 2. Guardamos las iniciales en mayúscula en un arreglo
        String[] letras = new String[cola.size()];
        int i = 0;
        while (!cola.isEmpty()) {
            String nombre = cola.poll();
            letras[i] = nombre.substring(0,1).toUpperCase();
            i++;
        }

        // 3. Ordenamos el arreglo de letras (alfabéticamente)
        for (int j = 0; j < letras.length - 1; j++) {
            for (int k = j + 1; k < letras.length; k++) {
                if (letras[j].compareTo(letras[k]) > 0) {
                    String temp = letras[j];
                    letras[j] = letras[k];
                    letras[k] = temp;
                }
            }
        }

        // 4. Concatenamos todas las letras en un solo String
        String resultado = "";
        for (int j = 0; j < letras.length; j++) {
            resultado += letras[j];
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(sociedadSecreta(Arrays.asList("Adam","Sarah","Malcolm"))); // AMS
        System.out.println(sociedadSecreta(Arrays.asList("bruce","clark","diana")));  // BCD
        System.out.println(sociedadSecreta(Arrays.asList("Zoe","anna","leo")));       // ALZ
    }
}
