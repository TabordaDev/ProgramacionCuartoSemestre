package Clase7;
import java.util.Stack;
public class Pilas {
    public static void main(String[] args) {
        //Creación de una pila de números enteros
        // Stack<Integer> pila = new Stack<>();

        // //verificar si una pila esta vacía
        // System.out.println(pila.empty()); //true

        // //Agregar elementos a la pila
        // pila.push(8);
        // pila.push(4);
        // pila.push(9);
        // pila.push(10);
        // pila.push(6);

        // //imprimir la pila
        // System.out.println(pila);
        
        // //Mostrar el elemento en la cima de la pila sin eliminarlo
        // System.out.println("Tope de la pila: " + pila.peek());

        // //Eliminar el elemento en la cima de la pila
        // System.out.println("Elemento eliminado de la cima de la pila: " + pila.pop());

        // //Imprimir pila
        // System.out.println(pila);

        // //Buscar y mostrar la posición del elemento requerido dentro de la pila
        // System.out.println(pila.search(10));
        // System.out.println(pila.search(9));
        // System.out.println(pila.search(4));
        // System.out.println(pila.search(8));
        // System.out.println(pila.search(50));

        // System.out.println(pila.empty()); //false

        //llamar al método para validar paréntesis
        OperacionesPilas op = new OperacionesPilas();

        String[] signos = {"(","(",")",")"};

        System.out.println("True si esta equilibrado/False si no lo esta: " + op.validarParentesis(signos));
    }
}
