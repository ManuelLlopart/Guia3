package models;

import Interfaces.Nadador;

public class Pez extends Animal implements Nadador {
    public Pez(String name) {
        super(name);
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void nadar() {

    }
}
