package ar.edu.unahur.obj2.motores;

public class MotorComun extends Motor {

    public MotorComun(){
        super();
        System.out.println("Creando el motor comun");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo motor comun");
        this.encendido = true;
    }

    @Override
    public void acelerar() {
        if(!this.encendido) {
            System.out.println("No se puede acelerar porque el motor no esta encendido");
        }
        System.out.println("acelerando el motor comun");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor comun");
        this.encendido = false;
    }
}