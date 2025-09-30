import java.util.*;

public class Ejercicio7 {
    public static List<String> cadenasDeCuatro(List<String> palabras) {
        Queue<String> cola = new LinkedList<>(palabras);
        List<String> resultado = new ArrayList<>();

        while (!cola.isEmpty()) {
            String w = cola.poll();
            if (w.length() == 4) resultado.add(w);
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(cadenasDeCuatro(Arrays.asList("Tomate","Papa","Par"))); // [Papa]
        System.out.println(cadenasDeCuatro(Arrays.asList("Luz","Casa","Sol", "Lago"))); // [Lago]
        System.out.println(cadenasDeCuatro(Arrays.asList("Azul","Rojo","Verde"))); // [Azul, Rojo]
    }
}
