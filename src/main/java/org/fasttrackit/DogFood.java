package org.fasttrackit;

public class DogFood extends Food{
    int saturationLevel;

    public DogFood(String name) {
        super(name);
    }

    public int getSaturationLevel() {
        return saturationLevel;
    }

    public void setSaturationLevel(int saturationLevel) {
        this.saturationLevel = saturationLevel;
    }
}
