package ar.edu.unahur.obj2.primerParcial;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {

    private String nombre;
    private int edad;

    @Test
    public void constructor() {
        Persona pasajero = new Persona("Hernan",40);
        assertNotNull(pasajero);
    }
}
