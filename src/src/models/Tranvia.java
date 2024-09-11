package models;

import Interfaces.Transporte;
import enums.TipoTransporte;

public class Tranvia implements Transporte {
    private String ruta;
    private int capacidad;
    private TipoTransporte transporte = TipoTransporte.TRANVIA;


    public Tranvia(String ruta, int capacidad) {
        this.ruta = ruta;
        this.capacidad = capacidad;
    }

    @Override
    public void arrancar() {
        System.out.println("Soy un models.Tranvia y estoy arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Soy un models.Tranvia y estoy detenido");
    }

    @Override
    public int obtenerCapacidad() {
        return this.capacidad;
    }

    public String getRuta() {
        return ruta;
    }

    public Tranvia setRuta(String ruta) {
        this.ruta = ruta;
        return this;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Tranvia setCapacidad(int capacidad) {
        this.capacidad = capacidad;
        return this;
    }

    public TipoTransporte getTransporte() {
        return transporte;
    }

    public void cambiarVia(int via){
        System.out.println("Voy por la via " + via);
    }
}
