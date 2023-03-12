/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fabio.replace;

/**
 *
 * @author Fabio Yocco
 */
public class Replace {

    public static void main(String[] args) {
        int first = 7;
        int second = 19;
        int third;
        third=second;
        second=first;
        first=third;
        
        System.out.println("first=" + first + " second=" + second);
    }
}
