package org.fasttrackit;


import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        Animal animal = new Animal("Berg");
        animal.age = 4;
        animal.favActivity = "Aport";
        animal.favFood = "meat";
        animal.health = 10;
        animal.mood = 8;
        animal.type = "dog";
        animal.race = "Beagle";

        Adopter adopter = new Adopter("Player1");
        adopter.cash = 200;

        AnimalFood animalFood = new AnimalFood("meat");
        animalFood.price = 35;
        animalFood.quantity = 15;
        animalFood.stock = 10;


        Vet vet = new Vet("Vety");
        vet.age = 40;
        vet.experience = 12;
        vet.gender = "male";
        vet.specialty = "cat and dog";

        Activity activity = new Activity("feed");
        activity.responsible = "Player1";
        activity.moodLevel = +1;
        activity.healthLevel = +2;

        Game game = new Game();
        game.adopter = "Aport";
        game.dog = "running";
        game.vet = "cuddle";

        System.out.println("We have a pet named " +animal.name +"  and a pet owner named "+adopter.name);

        }

    }

