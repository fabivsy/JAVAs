/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fabio.comision3;

import java.util.Scanner;

public class COMISION3 {

    public static void main(String[] args) {
        System.out.println("Hello World on Feb 26th Sunday!");
        int var1= 10, var2=15, result;
        result= var1 + var2;
        
        System.out.println("El resultado es: "+ result);
        
        int num;
        String nom;
        Scanner leer= new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        num=leer.nextInt();
        System.out.println("INGRESE UN NOMBRE");
        nom=leer.next();
        
         System.out.println("SU NOMBRE ES " + nom + " SU EDAD ES " + num);
        
        
        
    }
}
