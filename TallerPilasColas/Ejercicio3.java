import java.util.*;

public class Ejercicio3 {
    public static boolean cuadradosYCubos(int a, int b) {
        Deque<Integer> pila = new LinkedList<>();
        pila.push(a);
        pila.push(b);

        int bVal = pila.pop();
        int aVal = pila.pop();

        double raizCuadrada = Math.sqrt(aVal);
        double raizCubica = Math.cbrt(bVal);

        return Math.abs(raizCuadrada - raizCubica) < 1e-9;
    }

    public static void main(String[] args) {
        System.out.println(cuadradosYCubos(4, 8));   // true
        System.out.println(cuadradosYCubos(16, 48)); // false
        System.out.println(cuadradosYCubos(9, 27));  // true
    }
}

