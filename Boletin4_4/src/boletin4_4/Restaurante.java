
package boletin4_4;

/**
 *
 * @author rafa
 */
public class Restaurante {
    
    private float patatas;
    private float pulpo;

    public Restaurante() {
        patatas = 0f;
        pulpo = 0f;
    }

    public Restaurante(float pata, float pulp) {
        patatas = pata;
        pulpo = pulp;
    }

    public float getPatatas() {
        return patatas;
    }

    public void setPatatas(float set) {
        patatas = set;
    }

    public float getPulpo() {
        return pulpo;
    }

    public void setPulpo(float set) {
        pulpo = set;
    }

    public int calcCapacidad() {
        int cap1 = (int) (pulpo / 2 * 3);
        int cap2 = (int) (patatas * 3);
        if (cap1 > cap2) {
            return cap2;
        } else {
            return cap1;
        }
    }
}
