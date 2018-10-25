package boletin4_1;

public class coche {

    private int velocidad;

    public coche() {
        velocidad = 0;
    }

    public int getVelocidad() { //devuelve la velocidade actual
        return velocidad;
    }

    public void acelerar(int valor) {// .Este mÃ©todo incrementa a velocidade na cantidade valor
        velocidad += valor;
    }

    public void frenar(int menos) {//.Este mÃ©todo diminue a velocidade na cantidade menos.
        velocidad -= menos;
    }
}
