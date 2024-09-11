package models;

import Interfaces.Transporte;
import enums.TipoTransporte;

public class Bicicleta implements Transporte {
    private String nroSerie;
    private TipoTransporte transporte = TipoTransporte.BICICLETA;

    public Bicicleta(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public TipoTransporte getTransporte() {
        return transporte;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public Bicicleta setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
        return this;
    }

    @Override
    public void arrancar() {
        System.out.println("Soy una bici y estoy pedaleando sola");
    }

    @Override
    public void detener() {
        System.out.println("Soy una bici y choque");

    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    public static void ajustarAsiento (int altura){
        System.out.println("El asiento se ajusto a " + altura + "cm de altura");
    }
}
