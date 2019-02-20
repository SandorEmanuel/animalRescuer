package org.fasttrackit;

public class Rescuer {
    private String name;
    private String gender;
    private int cash;
    private int score;

    public Rescuer() {
        this.name = name;
    }

    public static int feed(Rescuer rescuer, Animal animal, Food food) {

        animal.hungerLevel -= 2;
        System.out.println(rescuer.getName() + " just gave some " + food.getName() + " food to " + animal.getName() + ". New Hunger Level: " + animal.hungerLevel);
        System.out.println();
        if (food.getName() == animal.getFavFood()) {
            animal.happinessLevel++;
            System.out.println(animal.getName() + " happiness level is: " + animal.happinessLevel);
            System.out.println();
        }
        return animal.hungerLevel;
    }


    public static int play(Rescuer rescuer, Animal animal, Activity activity) {
        if (activity.getName() == animal.getFavActivity()) {
            animal.happinessLevel += 2;
            animal.hungerLevel ++;
            System.out.println(rescuer.getName()+" and " + animal.getName() + " playing " + activity.getName() + "." + "New happiness level of your pet " + animal.getName() + " is: " + animal.happinessLevel);
            System.out.println();
        } else if (activity.getName() != animal.getFavActivity()) {
            animal.happinessLevel++;
            animal.hungerLevel ++;
            System.out.println(rescuer.getName()+" and " + animal.getName() + " playing " + activity.getName() + "." + "New happiness level of your pet " + animal.getName() + " is: " + animal.happinessLevel);
            System.out.println();
        }

        return animal.happinessLevel;
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

