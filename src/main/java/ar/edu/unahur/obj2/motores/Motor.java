package ar.edu.unahur.obj2.motores;

public class Motor {
    protected int caballosDeFuerza;
    protected String transmision;
    protected String combustible;

    public Motor(int caballosDeFuerza, String transmision, String combustible) {
        this.caballosDeFuerza = caballosDeFuerza;
        this.transmision = transmision;
        this.combustible = combustible;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public String getTransmision() {
        return transmision;
    }

    public String getCombustible() {
        return combustible;
    }
}
