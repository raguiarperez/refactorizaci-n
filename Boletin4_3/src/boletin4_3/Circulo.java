package boletin4_3;

/**
 *
 * @author rafa
 */
public class Circulo {

    private double radio;
    final double PI = 3.14;

    public Circulo() {
        radio = 0;
    }

    public Circulo(double r) {
        radio = r;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double r) {
        radio = r;
    }

    public double calcularArea() {
        return (Math.pow(radio, 2) * PI);
    }

    public double calcLongitud() {
        return (2 * radio * PI);
    }
}
