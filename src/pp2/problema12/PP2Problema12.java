/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema12;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]numeros = new int[10];
        mostrarVector(llenarVector(numeros));
    }
        public static int [] llenarVector(int []n){//Metodo de llenar el vector, recibe un arreglo de enteros, regresa un arreglo de enteros
        Scanner entradaEscaner = new Scanner(System.in);       
        for (int i = 0; i<n.length; i++){//Mientras que el valor de i sea menor que el tamaño del arreglo(10), i se aumentara en 1
            System.out.print("Introduce un número para la posición [" + i + "]"); //i indica la posición
            n[i]=entradaEscaner.nextInt();//En la pocision i se asigna el valor
                                          //Y regresa hasta que la posicion i se vuelva 10
                                          //En ese momento regresa el arreglo
        }
        return n;
       }
        public static void mostrarVector(int []n){ //El arreglo entra en el metodo
        double promedio;
        promedio=0;
            for(int i=0; i<n.length; i++){ //Mientras que i sea menor que el tamaño del arreglo(10), i aumentara 1                                     
               if(i%2==0){ //Si el residuo de la division de i entre 2 es igual a 0 se indica que es un numero par
                promedio=promedio+n[i]; //Por lo tanto se guardara en promedio = 0+(n[i]) i siendo la posicion
                                        //i regresa al for y como es menor se le suma 1 y baja de nuevo para checar
                                        //la segunda condicion, si se cumple, el valor de la posicion se suma a promedio
            }
        }
            System.out.print("La media de los valores " + n[0] + "," + n[2] //Se imprimen los valores de las posiciones pares
                    + "," + n[4] + "," + n[6] + "," + n[8] + " es: " + promedio/5); //La suma del valor de las posiciones entre 5
        }
}
