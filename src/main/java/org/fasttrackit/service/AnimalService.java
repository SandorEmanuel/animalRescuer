package org.fasttrackit.service;

import org.fasttrackit.domain.Animal;
import org.fasttrackit.persistance.AnimalRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;

public class AnimalService {

    private AnimalRepository animalRepository = new AnimalRepository();

    public void createAnimal (Animal animal) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating animal: "+animal);
        animalRepository.createAnimal(animal);

    }
    public void updateAnimal (Animal animal) throws Exception {
        System.out.println("Updating hungerLevel: "+animal.getHungerLevel()+" and happiness level: "+animal.getHappinessLevel());
        animalRepository.updateAnimalHungerHapiness(animal);
    }

    public void selectAnimal (Animal animal) throws SQLException, IOException, ClassNotFoundException {
        animalRepository.selectAnimal(animal);

    }
}
