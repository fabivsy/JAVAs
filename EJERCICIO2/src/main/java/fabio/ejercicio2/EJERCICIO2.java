

//Escribir un programa que pida tu nombre, lo guarde en una variable y lo
//muestre por pantalla.

package fabio.ejercicio2;
import java.util.Scanner;


public class EJERCICIO2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombre;
        
        System.out.println("POR FAVOR INGRESA TU NOMBRE: ");
        nombre = sc.nextLine();
        
        System.out.println("UN GUSTO DE CONOCERTE, " + nombre);
        
        
    }
}
