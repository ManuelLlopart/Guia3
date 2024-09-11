package models;

import Interfaces.Transporte;
import enums.TipoTransporte;

public class Autobus implements Transporte {
    private int nroLinea;
    private int capacidad;
    private TipoTransporte tipoTransporte = TipoTransporte.AUTOBUS;

    @Override
    public void arrancar() {
        System.out.println("Soy un models.Autobus y estoy arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Soy un models.Autobus y estoy detenido");
    }

    @Override
    public int obtenerCapacidad() {
        return this.capacidad;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public int getNroLinea() {
        return nroLinea;
    }

    public Autobus setNroLinea(int nroLinea) {
        this.nroLinea = nroLinea;
        return this;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Autobus setCapacidad(int capacidad) {
        this.capacidad = capacidad;
        return this;
    }

    public Autobus(int nroLinea, int capacidad) {
        this.nroLinea = nroLinea;
        this.capacidad = capacidad;
    }

}
