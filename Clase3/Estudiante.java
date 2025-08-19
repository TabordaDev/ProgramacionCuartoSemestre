public class Estudiante {
    //Atributos
    private int id;
    private int cedula;
    private String nombre;
    private String facultad;

    //Constructor
    public Estudiante(int id, int cedula, String nombre, String facultad){
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.facultad = facultad;

    public void matricularCursos(String[] cursos){
        System.out.println(Arrays.toString(cursos));

    }
    //método toString
    public String toString()
    {
        return "Estudiante: [id: "+ id + "cédula: "+ cedula + " Nombre: " + nombre + " Facultad: "+ facultad + "]";
    }




    }

}