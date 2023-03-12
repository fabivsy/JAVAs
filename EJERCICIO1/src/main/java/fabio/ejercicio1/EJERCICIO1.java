
// Escribir un programa que pida dos números enteros por teclado y calcule
//la suma de los dos. El programa deberá después mostrar el resultado de
//la suma

import java.util.Scanner;

public class EJERCICIO1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = input.nextInt();
        
        int suma = num1 + num2;
        
        System.out.print("La suma de los numeros es : " + suma);
        
    }
}
