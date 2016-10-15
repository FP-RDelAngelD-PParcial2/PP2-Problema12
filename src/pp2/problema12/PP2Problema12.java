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
        int[]numeros = new int[9];
        mostrarVector(llenarVector(numeros));
    }
        public static int [] llenarVector(int []n){//Metodo de llenar el vector, recibe un arreglo de enteros, regresa un arreglo de enteros
        Scanner entradaEscaner = new Scanner(System.in);       
        for (int i = 0; i<n.length; i++){
            System.out.print("Introduce un número para la posición [" + i + "]"); //i indica la posición
            n[i]=entradaEscaner.nextInt();
        }
        return n;
       }
        public static void mostrarVector(int []n){
        double promedio;
        promedio=0;
            for(int i=0; i<n.length; i++){ //aumenta 1 cada vez
               if(i%2==0){
                promedio=promedio+n[i]; //0+(n[0] + n[2] + n[4] + n[6] + n[8])
            }
        }
            System.out.print("La media de los valores " + n[0] + "," + n[2] 
                    + "," + n[4] + "," + n[6] + "," + n[8] + " es: " + promedio/5);
        }
}
