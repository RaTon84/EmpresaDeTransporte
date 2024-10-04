package ar.edu.unahur.obj2.primerParcial;

import java.util.Comparator;

public class ComparadorPasajeroPorEdad implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p2.getEdad(), p1.getEdad());
    }
}
