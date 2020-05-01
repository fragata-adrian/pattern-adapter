package ar.edu.unahur.obj2.motores;

public class MotorEconomico extends Motor{

    public MotorEconomico(){
        super();
        System.out.println("Creando el motor economico");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo motor economico");
        this.encendido = true;
    }

    @Override
    public void acelerar() {
        if(!this.encendido) {
            System.out.println("No se puede acelerar porque el motor no esta encendido");
        }
        System.out.println("acelerando el motor economico");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor economico");
        this.encendido = false;
    }
}
