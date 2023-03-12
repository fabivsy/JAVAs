//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
//Nota: investigar la función toUpperCase() y toLowerCase() en Java.

package fabio.ej_3_java_egg;

import java.util.Scanner;

public class Ej_3_JAVA_EGG {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE UNA FRASE");
        
        String frase = leer.nextLine();
        
        System.out.println("Mayuscula: "+ frase.toUpperCase() + " " + "Minusculas " + frase. toLowerCase());
        
    }
}
