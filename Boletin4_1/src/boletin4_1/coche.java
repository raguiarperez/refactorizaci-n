
package boletin4_1;

public class coche {
    
    private int velocidade;

    public coche() {
        velocidade = 0;
    }

    public int getVelocidade() { //devuelve la velocidade actual
        return velocidade;
    }

    public void acelerar(int valor) {// .Este mÃ©todo incrementa a velocidade na cantidade valor
        velocidade += valor;
    }

    public void frenar(int menos) {//.Este mÃ©todo diminue a velocidade na cantidade menos.
        velocidade -= menos;
    }
}


