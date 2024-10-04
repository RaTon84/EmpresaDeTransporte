package ar.edu.unahur.obj2.primerParcial;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo{

    private List<Persona> acompaniantes = new ArrayList<Persona>();

    public void agregarPasajero(Persona pasajero) {
        if (acompaniantes.size() < 3){
            acompaniantes.add(pasajero);
        } else {
            throw new RuntimeException("El automovil esta lleno");
        }
    }

    public List<Persona> getAcompaniantes() {
        return acompaniantes;
    }

    /// en este caso los requerimientos no incluye ninguna restriccion que haya pasajeros,
    /// sino lo hubiera implementasdo en la clase padre ya que todos van a pedri lo mismo "que no haya pasajeros"
    @Override
    public void cambiarDeChofer(Persona nuevoChofer) {
            this.chofer = nuevoChofer;
    }
}
