
package boletin4_4;

import java.util.Scanner;

/**
 * @author rafa
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("introduce la cantidad de patatas: ");
        float scanPat = scan.nextFloat();
        System.out.println("introduce la cantidad de pulpo: ");
        float scanPul = scan.nextFloat();

        Restaurante rest1 = new Restaurante(scanPat, scanPul);

        System.out.println("la capacidad es de : " + rest1.calcCapacidad() + " personas");

    }
    
}
