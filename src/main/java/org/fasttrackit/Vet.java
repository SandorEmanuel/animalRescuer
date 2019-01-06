package org.fasttrackit;

public class Vet extends Common {
    private String specialty;
    private int experience;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Vet(String name) {
        super(name);
    }
}
