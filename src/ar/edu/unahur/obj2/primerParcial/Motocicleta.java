package ar.edu.unahur.obj2.primerParcial;

import java.util.ArrayList;
import java.util.List;

public class Motocicleta extends Vehiculo{

    private List<Persona> acompaniantes = new ArrayList<Persona>();
    /// agregue una lista y no un solo String para mantener el polimorfismo
    /// asi mantegno los metodos de consulta sobre una lista

    public void agregarPasajero(Persona pasajero) {
        if (this.chofer != null & acompaniantes.size() < 1) {
            acompaniantes.add(pasajero);
        } else {
            throw new UnsupportedOperationException("Tiene un pasajero ya asignado o no tiene chofer");
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
            throw new UnsupportedOperationException("Tiene un pasajero ya asignado");
        }
    }
}
