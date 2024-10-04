package ar.edu.unahur.obj2.primerParcial;

import org.junit.Test;
import static org.junit.Assert.*;

public class AutobusTest {

    Autobus autobus = new Autobus();
    Persona chofer1 = new Persona("chofer1",50);
    Persona chofer2 = new Persona("chofer2",50);
    Persona hernan = new Persona("Hernan",40);
    Persona emiliano = new Persona("Emiliano",45);
    Persona ana = new Persona("Ana",18);

    @Test
    public void creacion(){
        assertNotNull(autobus);
    }

    @Test
    public void agregarPasajero(){
        autobus.setChofer(chofer1);
        autobus.agregarPasajero(hernan);
        assertEquals(1, autobus.getAcompaniantes().size());
    }

    @Test
    public void AsignarChofer(){
        autobus.setChofer(hernan);
        assertNotNull(autobus.getChofer());
    }

    @Test
    public void cambiarDeChofer(){
        autobus.cambiarDeChofer(chofer1);
        assertEquals(chofer1.getNombre(),autobus.getChofer().getNombre());
        autobus.cambiarDeChofer(chofer2);
        assertEquals(chofer2.getNombre(),autobus.getChofer().getNombre());
    }

    @Test
    public void pasajerosOrdenados(){
        autobus.setChofer(chofer1);
        autobus.agregarPasajero(hernan);
        autobus.agregarPasajero(emiliano);
        autobus.agregarPasajero(ana);
        assertEquals("Emiliano",autobus.getAcompaniantes().get(0).getNombre());
    }
}
