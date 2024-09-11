package models;

import Interfaces.Nadador;
import Interfaces.Volador;

public class Pato extends Animal implements Volador, Nadador {


    public Pato(String name) {
        super(name);
    }
    public void caminar(){
        System.out.println("Caminando...");
    }
    @Override
    public void volar() {
        System.out.println("Soy un pato sobrevolando el agua");
    }

    @Override
    public void comer() {
        System.out.println("Pato comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("Pato dormir");
    }

    @Override
    public void nadar() {

    }
}
