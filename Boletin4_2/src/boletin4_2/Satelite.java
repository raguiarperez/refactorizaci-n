package boletin4_2;

public class Satelite {

    private double meridian;
    private double paralelo;
    private double distanceEarth;

    public Satelite() {
        meridian = paralelo = distanceEarth = 0;
    }

    public Satelite(double m, double p, double d) {

        meridian = m;
        paralelo = p;
        distanceEarth = d;
    }

    public void verPosicion() {
        System.out.println(" El satelite se encuentra  en paralelo " + paralelo + " meridiano " + meridian + " y a una distancia de la tierra de " + distanceEarth);
    }
}
