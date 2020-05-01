package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.motores.Motor;

public class Aplicacion {

    public void usarMotor(Motor motor) {
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    public static void main(String[] args) {

    }
}
