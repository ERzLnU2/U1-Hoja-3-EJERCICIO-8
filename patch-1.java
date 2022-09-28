/**
 
 * @author Daw120
 
 * 8. Una empresa que gestiona un parque acuático te solicita una aplicación que les 
ayude a calcular el importe que hay que cobrar en taquilla por la compra de una
serie de entradas (cuyo número será introducido por el usuario). Existen dos tipos 
de entrada: infantiles, que cuestan 15,50€; y de adultos, que cuestan 20€.
En el caso de que el importe total sea igual o superior a 100€, se aplicará 
automáticamente un bono descuento del 5%

 */
package com.solomongo.ejercicio8_hoja3;
import java.util.Scanner;
public class Ejercicio8_Hoja3 {
      public static void main(String[] args) {
        
        // ENTRADA
        Scanner entrada=new Scanner(System.in); // se crea el Objeto Scanner, nuevo
                        // mantiene las propiedades y funciones de la Clase, con su metodo: Sys.in
        System.out.println("\n- Cuantas entradas infantiles, a 15,50euros desea🔴");
        int entradasIn=entrada.nextInt();
        float totentradasIn= (float) ((int) entradasIn*15.5); // se hace un cast y la operacion de multip.
        
        System.out.println("- Cuantas entradas para adultos, a 20euros desea🔴");
        int entradasA=entrada.nextInt();
        int totentradasA=entradasA*20;       
        float total= totentradasIn+totentradasA; // las suma todas y saca la variable total, en float decimal
        
        if (total<100){   // vaya, ha salido un if por aqui.........habra un else..
            // si el total no supera los 100 euros, sale la variable total y ya.
        System.out.println("* El precio total de las entradas es: "+ total+"€");    
        }
        else if (total>100){ // else if si supera los 100 euros..
        float totaldes=total-(total*10/100); // resta al Total un diez% (tambien *0.90 es lo mismo)
        System.out.println("* El precio total de las entradas con un 10% de descuento es: "+totaldes+" euros.\n"); //€
    }
    }
    }
