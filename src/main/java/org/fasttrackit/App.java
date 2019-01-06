package org.fasttrackit;


import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        Animal animal = new Animal("Berg");
        animal.setAge(4);
        animal.setFavActivity("Aport");
        animal.setFavFood("meat");
        animal.setHealth(10);
        animal.setMood(8);
        animal.setType("dog");
        animal.setRace("beagle");

        Adopter adopter = new Adopter("Player1");
        adopter.setCash(200);

        AnimalFood animalFood = new AnimalFood("meat");
        animalFood.setPrice(35);
        animalFood.setQuantity(15);
        animalFood.setStock(10);


        Vet vet = new Vet("Vety");
        vet.setAge(40);
        vet.setExperience(12);
        vet.setGender("male");
        vet.setSpecialty("cat and dog");

        Activity activity = new Activity("feed");
        activity.setResponsible("Player1");
        activity.setMoodLevel(+1);
        activity.setHealthLevel(+2);

        Game game = new Game();


        System.out.println("We have a pet named " +animal.getName() +"  and a pet owner named "+adopter.getName());

        }

    }

