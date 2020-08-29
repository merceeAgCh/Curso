
/*ToDo
Comenta cada linea de codigo
explicando su funcion.
 */

import  java.io.*;
import java.lang.*;

public class variables_all {

   public static void main (String args []){

       System.out.println("Este ejercicio es para aprender a imprimir variables a las que se les ha asignado un valor.  ");
       System.out.println("-------------------------------------------------------------------------------------------------");
       System.out.println("Curso de programación básica con aplicación a Java.");
       System.out.println("-------------------------------------------------------------------------------------------------");

        int edad;
        edad = 25;
        System.out.println("Mi edad es de: " + edad + "años.");
       /*ToDo
       Cambia el valor a la variable de edad y en una impresión a
       pantalla explica el por qué es de ese tipo la variable,
       ejemplo es un in ya que se ponen numeros enteros.
        */
       CharSequence nombre;
       nombre = "Mercedes";
        System.out.println("Me llamo: " + nombre);
        /*ToDo
        Cambia el valor de la variable por tu nombre
        y explica por que es de ese tipo la variable.
         */

       double e = 4.5e2;
       float f = 4.5e2f;
       /*
       Esta es una forma un tanto mas cientifica de expresar un numero entero utilizando decimales
       Se trata de multiplicar un número por una potencia de 10:
                    4.3el
                    4.3*10 1 (es 10 subindice 1)
        */
       System.out.println(e);
       System.out.println(f);

       /*
       Para comprender mejor el uso de las variables y tipos, les dejo la siguiente liga donde se explica bien
       https://users.dcc.uchile.cl/~lmateu/Java/Apuntes/tiposprim.htm

        */

       boolean b = true;
       if (b == true)
           System.out.println("Hola a todos!");

       byte a = 126;

       // byte tiene un valor de 8 bits
       System.out.println(a);

       a++;
       System.out.println(a);

       // Se desborda aquí porque
       // el byte puede contener valores de -128 a 127
       a++;
       System.out.println(a);

       // bucle dentro del rango
       a++;
       System.out.println(a);
}

}
