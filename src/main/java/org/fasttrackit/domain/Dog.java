package org.fasttrackit.domain;

public class Dog extends Animal{
    int sleepDuration;

    public Dog(String name) {
        super(name);
    }
    public Dog(){

    }

    @Override
    public void showMood() {
        System.out.println("Your dog "+getName()+" is happy and it`s waging his tail!");
    }

    public int getSleepDuration() {
        return sleepDuration;
    }

    public void setSleepDuration(int sleepDuration) {
        this.sleepDuration = sleepDuration;
    }
}
