/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author rafa
 */
public class Boletin4_3 {

    public static void main(String[] args) {
        Circulo circu1 = new Circulo();
        Circulo circu2 = new Circulo(5);
        System.out.println("longitud de circulo2: " + circu2.calcLongitud());
        System.out.println("area de circulo2: " + circu2.calcularArea());
    }
    
}
