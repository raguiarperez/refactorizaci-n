package boletin4_1;

public class Boletin4_1 {

    public static void main(String[] args) {
        coche coche1 = new coche();
        System.out.println("la velocidad inicial es de " + coche1.getVelocidad());
        coche1.acelerar(50);

        System.out.println("la nueva velocidad es de " + coche1.getVelocidad());
    }

}
