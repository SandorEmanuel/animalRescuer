package org.fasttrackit;

public class Dog extends Animal{
    int sleepDuration;

    public Dog(String name) {
        super(name);
    }

    public int getSleepDuration() {
        return sleepDuration;
    }

    public void setSleepDuration(int sleepDuration) {
        this.sleepDuration = sleepDuration;
    }
}
