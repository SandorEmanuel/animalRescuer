package org.fasttrackit;

import org.fasttrackit.domain.Animal;

public class Rescuer {
    private String name;
    private String gender;
    private int cash;
    private int score;

    public Rescuer() {
        this.name = name;
    }

    public static int feed(Rescuer rescuer, Animal animal, Food food) {

        animal.setHungerLevel(animal.getHungerLevel()-2);
        System.out.println(rescuer.getName() + " just gave some " + food.getName() + " food to " + animal.getName() + ". New Hunger Level: " + animal.getHungerLevel());
        System.out.println();
        if (food.getName() == animal.getFavFood()) {
            animal.setHappinessLevel(animal.getHappinessLevel()+1);
            System.out.println(animal.getName() + " happiness level is: " + animal.getHappinessLevel());
            System.out.println();
        }
        return animal.getHungerLevel();
    }


    public static int play(Rescuer rescuer, Animal animal, Activity activity) {
        if (activity.getName() == animal.getFavActivity()) {
            animal.setHappinessLevel(animal.getHappinessLevel()+2);
            animal.setHungerLevel(animal.getHungerLevel()+1);
            System.out.println(rescuer.getName()+" and " + animal.getName() + " playing " + activity.getName() + "." + "New happiness level of your pet " + animal.getName() + " is: " + animal.getHappinessLevel());
            System.out.println();
        } else if (activity.getName() != animal.getFavActivity()) {
            animal.setHappinessLevel(animal.getHappinessLevel()+1);
            animal.setHungerLevel(animal.getHungerLevel()+1);
            System.out.println(rescuer.getName()+" and " + animal.getName() + " playing " + activity.getName() + "." + "New happiness level of your pet " + animal.getName() + " is: " + animal.getHappinessLevel());
            System.out.println();
        }

        return animal.getHappinessLevel();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}

