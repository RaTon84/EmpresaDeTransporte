package ar.edu.unahur.obj2.primerParcial;

import static org.junit.Assert.*;
import org.junit.Test;

public class motocicletaTest {

    Motocicleta motocicleta = new Motocicleta();
    Persona chofer1 = new Persona("chofer1",50);
    Persona chofer2 = new Persona("chofer2",50);
    Persona hernan = new Persona("Hernan",40);
    Persona emiliano = new Persona("Emiliano",45);
    Persona ana = new Persona("Ana",18);

    @Test
    public void creacion(){
        assertNotNull(motocicleta);
    }

    @Test
    public void motocicletaPasajero(){
        motocicleta.setChofer(chofer1);
        motocicleta.agregarPasajero(hernan);
        assertNotNull(motocicleta.getAcompaniantes());
    }

    @Test
    public void motocicletaAsignarChofer(){
        motocicleta.setChofer(emiliano);
        assertNotNull(motocicleta.getChofer());
    }

    @Test
    public void motocicletaCambiarDeChofer(){
        motocicleta.cambiarDeChofer(ana);
        assertEquals(ana.getNombre(),motocicleta.getChofer().getNombre());
    }

}
