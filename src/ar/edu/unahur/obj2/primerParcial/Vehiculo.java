package ar.edu.unahur.obj2.primerParcial;

public abstract class Vehiculo {

    protected Double kmRecorridos;
    protected Persona chofer;

    public Double getKmRecorridos() {
        return kmRecorridos;
    }

    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public abstract void cambiarDeChofer(Persona nuevoChofer);
}
