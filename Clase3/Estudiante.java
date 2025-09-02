import java.util.Arrays;
import java.util.Scanner;

public class Estudiante {
    //Atributos
    private int id;
    private int cedula;
    private String nombre;
    private String facultad;
    private String[] cursos;

    //Constructor
    public Estudiante(int id, int cedula, String nombre, String facultad){
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public void matricularCursos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos cursos desea matricular " + nombre + "?");
        int n = sc.nextInt();
        sc.nextLine();

        cursos = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del curso " + (i + 1) + ": ");
            cursos[i] = sc.nextLine();
        }

        System.out.println(nombre + " ha matriculado los cursos: " + Arrays.toString(cursos));
    }
    //método toString
    public String toString(){
        return "\nEstudiante: [ id: " + id + " | Cédula: " + cedula +
               " | Nombre: " + nombre + " | Facultad: " + facultad +
               " | Cursos: " + (cursos != null? Arrays.toString(cursos) : "Ninguno") + " ]";
    }

}