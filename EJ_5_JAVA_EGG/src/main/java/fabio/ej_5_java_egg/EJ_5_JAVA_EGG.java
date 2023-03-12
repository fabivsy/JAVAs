//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple
//y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().

package fabio.ej_5_java_egg;

import java.util.Scanner;

public class EJ_5_JAVA_EGG {

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un numero");
        
        double num =leer.nextDouble();
        
        
        System.out.println("El doble : " + (num*2)+ " Triple: " + (num*3) + "Raiz: "+ Math.sqrt(num));
    }
}
