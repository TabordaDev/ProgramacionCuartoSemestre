package Miniproyecto.Tarea;

public class Main {
    public static void main(String[] args) {
        Tarea tarea1 = new Tarea("0", "Algo"
        , 1, 123456);
        Tarea tarea2 = new Tarea("0", "Algo"
        , 1, 123456);
        GestorTareas gestor = new GestorTareas(null, 
        null, null);
        gestor.agregarTarea(tarea1);
        gestor.agregarTarea(tarea2);
    }
}
