package boletin4_4;

/**
 *
 * @author rafa
 */
public class Restaurante {

    private float potatoes;
    private float pulpiño;

    public Restaurante() {
        potatoes = 0f;
        pulpiño = 0f;
    }

    public Restaurante(float pata, float pulp) {
        potatoes = pata;
        pulpiño = pulp;
    }

    public float getPotatoes() {
        return potatoes;
    }

    public void setPotatoes(float set) {
        potatoes = set;
    }

    public float getPulpiño() {
        return pulpiño;
    }

    public void setPulpiño(float set) {
        pulpiño = set;
    }

    public int calcCapacidad() {
        int cap1 = (int) (pulpiño / 2 * 3);
        int cap2 = (int) (potatoes * 3);
        if (cap1 > cap2) {
            return cap2;
        } else {
            return cap1;
        }
    }
}
