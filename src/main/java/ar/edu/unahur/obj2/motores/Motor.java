package ar.edu.unahur.obj2.motores;

public abstract class Motor {
    protected boolean encendido = false;

    abstract public void encender();
    abstract public void acelerar();
    abstract public void apagar();
}
