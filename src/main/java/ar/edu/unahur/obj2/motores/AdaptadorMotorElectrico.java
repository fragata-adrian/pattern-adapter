package ar.edu.unahur.obj2.motores;

public class AdaptadorMotorElectrico implements Motor {
    private MotorElectrico motorElectrico;

    public AdaptadorMotorElectrico(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public int getCaballosDeFuerza() {
        return motorElectrico.getHorsepower();
    }

    @Override
    public String getTransmision() {
        return motorElectrico.getTransmission();
    }

    @Override
    public String getCombustible() {
        return motorElectrico.getFuel();
    }
}
