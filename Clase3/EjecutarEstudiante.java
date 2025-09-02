import java.util.Arrays;

public class EjecutarEstudiante{
    public static void main(String [] args) {
        //Creacion de los objetos
        Estudiante objEst1 = new Estudiante(1, 1001233980, "Angelica", "Ingenieria");
        Estudiante objEst2 = new Estudiante(2, 1112040430, "Norma", "Ingeniería"); 
        Estudiante objEst3 = new Estudiante(3, 1007620039, "Jeison","Ingenieria");
        Estudiante objEst4 = new Estudiante(4, 1336294586, "Alberto", "Ciencias" );

        //Matricular cursos manual
        //objEst1.matricularCursos(new String[]{"Programación 1"})

        //Matricular cursos desde la consola
        objEst1.matricularCursos();
        objEst2.matricularCursos();
        objEst3.matricularCursos();
        objEst4.matricularCursos();

        //Creacion del arreglo de objetos (Estudiantes)
        //int [] a = new int[1];
        //Estudiante [] e = new Estudiante[4];
        /*
        e[0] = objEst1;
        e[1] = objEst2;
        e[2] = objEst3;
        e[4] = new Estudiante(4, 1007836698, "Daniel", "ingeniería");
        */

        //Creación del array de estudiantes
        Estudiante [] e = {objEst1, objEst2, objEst3, objEst4};

        //Imprimir todos los estudiantes con sus cursos
        System.out.println("________________________________");
        System.out.println("\n--- LISTADO DE ESTUDIANTES ---|");
        System.out.println("________________________________");
        System.out.println(Arrays.toString(e));
        // Actividad pendiente
        // Implementar el metodo matricular cursos para que cada estudiante pueda realizar
        // dicha operación 

    }

}