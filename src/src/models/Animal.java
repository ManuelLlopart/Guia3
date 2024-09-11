package models;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void comer();
    public abstract void dormir();

}
