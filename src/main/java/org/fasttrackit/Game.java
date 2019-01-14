package org.fasttrackit;

public class Game {
    private Rescuer rescuer;
    private Animal animal;
    private Vet vet;


    public Game(Animal animal, Rescuer rescuer){
        this.animal = animal;
        this.rescuer = rescuer;
    }
    public Game(Animal animal, Vet vet){
        this.animal = animal;
        this.vet = vet;
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }


}
