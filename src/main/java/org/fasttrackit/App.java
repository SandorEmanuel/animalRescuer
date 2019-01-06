package org.fasttrackit;


import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.name = "Berg";
        animal.age = 4;
        animal.favActivity = "Aport";
        animal.favFood = "meat";
        animal.health = 10;
        animal.mood = 8;
        animal.type = "dog";
        animal.race = "Beagle";

        Adopter adopter = new Adopter();
        adopter.name = "Player1";
        adopter.cash = 200;

        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "meat";
        animalFood.price = 35;
        animalFood.quantity = 15;
        animalFood.stock = 10;


        Vet vet = new Vet();
        vet.age = 40;
        vet.experience = 12;
        vet.gender = "male";
        vet.specialty = "cat and dog";
        vet.name = "Vety";

        Activity activity = new Activity();
        activity.name = "feed";
        activity.responsible = "Player1";
        activity.moodLevel = +1;
        activity.healthLevel = +2;

        Game game = new Game();
        game.adopter = "Aport";
        game.dog = "running";
        game.vet = "cuddle";

        if (animal.health >= 8 && animal.mood >= 7){
            System.out.println("Happy Pet! Congradulations " + adopter.name );
            adopter.score ++;
            System.out.println("New Score:" + adopter.score);

        }
        System.out.println();
        System.out.println("First App ;)");
    }
}
