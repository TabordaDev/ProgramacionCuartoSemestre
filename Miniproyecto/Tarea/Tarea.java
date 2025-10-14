package Miniproyecto.Tarea;

public class Tarea {
    private String id;
    private String descripcion;
    private int prioridad;
    private long tiempoLlegada;
    
    public Tarea(String id, String descripcion, int prioridad, long tiempoLlegada) {
        this.id = id;
        this.descripcion = descripcion;
        this.tiempoLlegada = tiempoLlegada;
    }
    public String getId(){
        return descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getPrioridad(){
        return prioridad;
    }
    public long getTiempoLlegada(){
        return tiempoLlegada;
    }
}
