package ar.edu.unahur.obj2.primerParcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Autobus extends Vehiculo {

    private List<Persona> acompaniantes = new ArrayList<Persona>();

    public void agregarPasajero(Persona pasajero) {
        if (this.chofer != null & acompaniantes.size() < 20){
            acompaniantes.add(pasajero);
            Collections.sort(acompaniantes, new ComparadorPasajeroPorEdad());
        } else {
            throw new UnsupportedOperationException("El autobus esta lleno");
        }
    }

    public List<Persona> getAcompaniantes() {
        return acompaniantes;
    }

    @Override
    public void cambiarDeChofer(Persona nuevoChofer) {
        if (acompaniantes.isEmpty()) {
            this.chofer = nuevoChofer;
        } else {
            throw new UnsupportedOperationException("Tiene pasajeros en el bus");
        }
    }


}
