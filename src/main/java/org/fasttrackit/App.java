package org.fasttrackit;


public class App
{
    public static void main( String[] args )
    {
        Animal animal = new Animal("Chaika");
        animal.setAge(4);
        animal.setFavActivity("Aport");
        animal.setFavFood("meat");
        animal.setHealth(10);
        animal.setMood(8);
        animal.setType("dog");
        animal.setRace("beagle");

        Rescuer rescuer = new Rescuer("John");
        rescuer.setCash(200);

        Food food = new Food("Purina");
        food.setPrice(35);
        food.setQuantity(15);
        food.setStock(10);

        Vet vet = new Vet("Vety");
        vet.setAge(40);
        vet.setExperience(12);
        vet.setGender("male");
        vet.setSpecialty("cat and dog");

        Activity activity = new Activity("Aport");
        activity.setResponsible("Player1");
        activity.setMoodLevel(+1);
        activity.setHealthLevel(+2);

        Game game = new Game(animal);


        Food food1 = new Food("Pedigree");
        Rescuer rescuer1 = new Rescuer("Nick");
        Animal animal1 = new Animal("Berg");


        Rescuer.feed(animal, rescuer, food);

        Rescuer.feed(animal1, rescuer1, food1);

        Rescuer.play(rescuer, animal, activity);
        }

    }

