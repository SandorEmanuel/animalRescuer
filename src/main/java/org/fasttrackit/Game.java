package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Rescuer rescuer;
    private Animal animal;
    private Vet vet;

    public Game(Animal animal, Rescuer rescuer) {
        this.animal = animal;
        this.rescuer = rescuer;
    }


    public void start() {
        initFood();
        initActivities();
        displayAvailableFood();
        displayAvailableActivities();

    }

    private List<Food> availableFood = new ArrayList<>(2);
    private Activity[] availableActivities = new Activity[4];

    private void initFood() {

        Food food1 = new Food("Purina");
        Food food2 = new Food("Meat");

        availableFood.add(food1);
        availableFood.add(food2);
    }

    private void initActivities() {
        Activity activity1 = new Activity("Aport");
        Activity activity2 = new Activity("Frisbee");

        availableActivities[0] = activity1;
        availableActivities[1] = activity2;
    }

    private void displayAvailableFood() {

        System.out.println("Available foods are: ");

        for (int i = 0; i < availableFood.size(); i++) {
            System.out.println(availableFood.get(i).getName());
        }
    }

    private void displayAvailableActivities() {

        System.out.println("Available activities are: ");

        for (Activity activity : availableActivities) {
            if (activity != null) {
                System.out.println(activity.getName());
            }
        }
    }


    public Game(Animal animal, Vet vet) {
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
