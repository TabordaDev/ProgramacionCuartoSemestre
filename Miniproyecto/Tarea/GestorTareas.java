package Miniproyecto.Tarea;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class GestorTareas {
    private Tarea[] tareas;
    private Stack<Tarea> pilaTareas;
    private Queue<Tarea> colTareas;
    private HashMap<Tarea, String> mapaTrazabilidad; // [{Tarea: "Completada"}]
    //Constructor
    public GestorTareas(Tarea[] tareas, Stack<Tarea> pilaTareas, 
    Queue<Tarea> colTareas){
        this.tareas = tareas;
        this.pilaTareas = pilaTareas;
        this.colTareas = colTareas;
        this.mapaTrazabilidad = new HashMap<>();
    }
    //Metodos
    public void agregarTarea(Tarea tarea){
        int prioridad = tarea.getPrioridad();
        if (prioridad == 3)
            pilaTareas.push(tarea);
        else if(prioridad == 2 || prioridad == 1)
        colTareas.add(tarea);
    }

    public Tarea procesarSiguienteTarea(){
        Tarea t; //Guardar la tarea que se procesa
        if (!pilaTareas.isEmpty()){
            t = pilaTareas.pop();
            mapaTrazabilidad.put(t, "Completada");
            return t;
        }
        else if (!pilaTareas.isEmpty() && !colTareas.isEmpty()){
            t = colTareas.poll();
            mapaTrazabilidad.put(t, "Completada");
            return t;
        }
        //Tirar una excepcion
        throw new IllegalArgumentException("Tareas vacías");
    }
    public String consultarEstadoTarea(String idTarea){
        for (Tarea t : mapaTrazabilidad.keySet()){
            if (t.getId() == idTarea)
                return mapaTrazabilidad.get(t); //{tarea, string}
        }
        //Si está pendiente
        for (Tarea t : pilaTareas){
            if (t.getId() == idTarea)
                return "Está pendiente";
        }

        for (Tarea t : colTareas){
            if (t.getId() == idTarea)
                return "Está pendiente";
        }
        
        // Si no se encuentra
        return "ID no encontrado";
       
    }

}



