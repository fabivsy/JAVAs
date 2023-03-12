

//Escribir un programa que pida dos números enteros por teclado y calcule la suma 
//de los dos. El programa deberá después mostrar el resultado de la suma

package fabio.ejercicioegg1;

import java.util.Scanner;

public class EjercicioEgg1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        System.out.println("La suma es: " + (num1 + num2));
        
    }
}
