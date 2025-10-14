
import java.util.Stack;

class Ejercicio3 {
    public static boolean verificar(int a, int b) {
        Stack<Integer> pila = new Stack<>();
        pila.push(a);
        pila.push(b);

        int b1 = pila.pop();
        int a2 = pila.pop();

        double raizA = Math.sqrt(a2);
        double raizB = Math.cbrt(b1);

        return Math.abs(raizA - raizB) < 0.0000001;
    }

    public static void main(String[] args) {
        System.out.println(verificar(4, 8));   // true
        System.out.println(verificar(16, 48)); // false
        System.out.println(verificar(9, 27));  // true
    }
}
