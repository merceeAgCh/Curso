import java.util.Scanner;

/**
 * Created by Merce on 28/08/2020.
 */
public class Principal {
    public static void main (String []args){
        Scanner reed =new Scanner(System.in);
        Alumno alumno_escuela[]= new Alumno[10];
        Profesor profesor_escuela[]= new Profesor[2];
        int i;
        for (i=2; i<10; i++) {
            alumno_escuela[i] = new Alumno();
            System.out.println(" Nombre: ");
            alumno_escuela[i].setNombre(reed.next());
            System.out.println("RFC");
            alumno_escuela [i].setRFC(reed.next());
            System.out.println("Matrícula");

            alumno_escuela [i].setMatricula(reed.next());
            System.out.println("Carrera");
            alumno_escuela [i].setCarrera(reed.next());
        }
        profesor_escuela[0] = new Profesor(" Mercedes ", " 13170001 ");
        profesor_escuela[1] = new Profesor(" Daniela ", " 15061834");
        for (i=0; i<10; i++){
            System.out.println(profesor_escuela[i].toString());
        }
    }

}