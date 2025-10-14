package PracticaPilasColasArraylist;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Arraylist: Lista dinamica, puede crecer y reducir su tamaño
        // En un Array normal: int[] nuevo = new int[3]; //Ingresaran 3 datos
        //-------------------------------------------------------------------
        //En ArrayList:
        //String[] nombres = {"Thiago","Copilot","Andres"};
        //ArrayList<String> lista = new ArrayList<>(); //Agregar elementos
        // lista.add("Angel"); // -> Agregar Elemento
        // lista.add("Thiago");
        // lista.get(0) //Obtener Elemento
        // lista.remove("Thiago"); //Remueve por objeto
        // lista.remove(0); //Remover por posición
        // lista.contains("Thiago"); // verifica si existe el elemento
        // lista.size(); //El tamaño
        // lista.isEmpty(); // Verifica si esta vacio
        // Agregar y eliminar los elementos dentro de la lista
        // for(String nombre : nombres){
        //     lista.add(nombre);
        // }
        // for(String nombre : nombres){
        //     lista.remove(nombre);
        // }
        // System.out.println(lista.isEmpty()); //True
        // System.out.println(lista); //["Thiago", "copilot", "Andres"]

        //Sumar los números de un array
        // int[] nums = {1,2,3,4};
        // ArrayList<Integer> lista = new ArrayList<>();
        // for (int n : nums) { //Agregar numeros a la lista
        //     lista.add(n);
        // }

        // int sum = 0;
        // //Forma 1:
        // // for (int n : lista) {
        // //     sum += n;
        // // }
        // //Forma 2:
        // for(int i = 0; i < lista.size(); i++){
        //     sum += lista.get(i);
        // }
        // System.out.println(sum);
        // //Contiene un elemento
        // if (lista.contains(3))
        //     System.out.println("Contiene el 3");
        // else
        //     System.out.println("No contiene el 3");
        
        // Eliminar todos los elementos repetidos
        // int[] nums = {1,1,2,3,2,3,4};
        // ArrayList<Integer> lista = new ArrayList<>();
        // for (int n : nums) { //Agregar numeros a la lista
        //     lista.add(n);
        // }

        // for (int i = 0; i < lista.size(); i++){
        //     for(int j = i + 1; j < lista.size(); j++){
        //         if (lista.get(i) == lista.get(j)){ //lista[i]
        //             lista.remove(j);
        //         }
        //     }
        // }
        // System.out.println(lista);

        //Ejercicios con ArrayList

        //#1
        // int[] nums = {1,2,3,4,5};
        // int sum = 0;
        // ArrayList<Integer> lista = new ArrayList<>();

        // for(int n : nums){
        //     lista.add(n);
        // }
        // for (int i = 0; i < lista.size();i++){
        //     sum += lista.get(i);
        // }
        // System.out.println(sum/lista.size());

        //#2 Dado un array string
        // String[] Productos = {"A","B","C","D","C"};
        // String Delete = "C"; //Elemento a eliminar

        // ArrayList<String> lista = new ArrayList<>();
        // for(String P : Productos){
        //     lista.add(P);
        // }

        // // lista.remove(Delete);
        // // System.out.println(lista);

        // for(int i = 0; i < lista.size(); i++){
        //     if (lista.get(i) == Delete){ //lista[i]
        //         lista.remove(i);
        //     }
        // }
        // System.out.println(lista);

        //#3 Dado un Array de enteros, encontrar el numero grande y el mas pequeño, luego sumar ambos
        // int[] Nums = {1,2,3,4,8,10};
        // ArrayList<Integer> lista = new ArrayList<>();
        
        // for(int n : Nums){
        //     lista.add(n);
        // }
        // int mayor = 0;
        // int menor = 1;
        // for(int i = 0; i<lista.size();i++){
        //     if(lista.get(i) > mayor){
        //         mayor = lista.get(i);
        //     }
        //     if(lista.get(i) < menor){
        //         menor = lista.get(i);
        //     }
        // } 
        // System.out.println("El mayor es: "+mayor);
        // System.out.println("El menor es: "+menor);
        // System.out.println(("La suma de ambos es: ")+(mayor+menor));

        //HASHMAP -> MAPAS (clave,valor)
        // {"Thiago": "Gay", "Angel":"Homo"};

        //Inicializamos:
        //Otra manera de hacerlo: HashMap<String,String> mapa = new HashMap<>();
        //Map<Integer,Integer> mapa = new HashMap<>();

        // mapa.put("Thiago", "18"); //Agregar clave, valor
        // mapa.get("Thiago"); //Obtener el valor de la clave asociada -> "18"
        // mapa.remove("Thiago"); //Eliminar el par de clave y valor
        // mapa.containsKey("Thiago"); //Verificar si contiene la clave
        // mapa.containsValue("18"); //Verificar si contiene el valor
        // mapa.size(); //Tamaño de los pares
        // mapa.isEmpty(); //Verifica si esta vacio
        // mapa.put("Thiago", "19"); //Agregar clave:valor
        // mapa.keySet(); //Obtener claves
        // mapa.values(); //Obtener valores

        //Contar cantidad de veces que aparece un elemento
        // Map<Integer,Integer> mapa = new HashMap<>();
        // int[] nums = {1,1,2,2,3,4,4,5};
        // for (int n: nums){
        //     mapa.put(n, 0);
        // }
        // // {};

        // // Aumentar contador para cada clave
        // for (int n: nums){
        //     if (mapa.containsKey(n)){
        //         mapa.put(n, mapa.get(n) + 1); //2:{1:2} 4:{2:2}
        //     } else
        //         mapa.put(n, 1); //1:{1:1}, 3:{2:1}
            
        // }
        // System.out.println(mapa);

        // Mapa de notas, tres estudiantes, estudiante:nota, imprimir los estudiantes aprovados
        // HashMap<String, Integer> mapa = new HashMap<>();
        // mapa.put("Thiago", 10);
        // mapa.put("Angel", 6);
        // mapa.put("Taborda", 4);

        // for(String e : mapa.keySet()){
        //     if (mapa.get(e)>5) {
        //         System.out.println("Aprovaste "+e+" con una nota de: "+mapa.get(e));
                
        //     }

        // }
        


    }
}
