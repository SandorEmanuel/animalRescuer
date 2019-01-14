package org.fasttrackit;

public class Rescuer {
    private String name;
    private String gender;
    private int cash;
    private int score;

    public Rescuer (String name){
            this.name=name;
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

    public static void feed(Animal animal, Rescuer rescuer, Food food) {

        System.out.println(rescuer.getName() + " just gave some " + food.getName() + " food to " + animal.getName());
    }

    public static void play(Rescuer rescuer, Animal animal, Activity activity){
            System.out.println("Rescuer "+rescuer.getName()+" and Pet "+animal.getName()+" playing "+activity.getName());
    }

    }

