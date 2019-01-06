package org.fasttrackit;

public class Adopter extends Common {
    private int cash;
    private int score;

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

    public Adopter(String name) {
        super(name);
    }
}
