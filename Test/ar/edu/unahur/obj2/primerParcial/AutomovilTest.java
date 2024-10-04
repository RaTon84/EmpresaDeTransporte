package ar.edu.unahur.obj2.primerParcial;

import org.junit.Test;
import static org.junit.Assert.*;

public class AutomovilTest {

    Automovil automovil = new Automovil();
    Persona chofer1 = new Persona("chofer1",50);
    Persona chofer2 = new Persona("chofer2",50);
    Persona hernan = new Persona("Hernan",40);
    Persona emiliano = new Persona("Emiliano",45);
    Persona ana = new Persona("Ana",18);

    @Test
    public void test() {
        assertNotNull(automovil);
    }

    @Test
    public void agregarPasajero(){
        automovil.setChofer(chofer1);
        automovil.agregarPasajero(hernan);
        automovil.agregarPasajero(emiliano);
        automovil.agregarPasajero(ana);
        assertEquals(3, automovil.getAcompaniantes().size());
    }

    @Test
    public void AsignarChofer(){
        automovil.setChofer(hernan);
        assertNotNull(automovil.getChofer());
    }

    @Test
    public void cambiarDeChofer(){
        automovil.cambiarDeChofer(chofer1);
        automovil.cambiarDeChofer(chofer2);
        assertEquals(chofer2.getNombre(),automovil.getChofer().getNombre());
    }
}
