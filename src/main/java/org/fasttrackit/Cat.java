package org.fasttrackit;

public class Cat extends Animal {

    int sleepDuration;

    public Cat(String name) {
        super(name);
    }
    public void showMood(){
        System.out.println("Your cat "+getName()+" is happy and its purring!");
    }
    public int getSleepDuration() {
        return sleepDuration;
    }

    public void setSleepDuration(int sleepDuration) {
        this.sleepDuration = sleepDuration;
    }
}
