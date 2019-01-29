package org.fasttrackit;


public class App {
    public static void main(String[] args) {
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

        Food food = new Food("meat");
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

        Activity activity1 = new Activity("Frisbee");

        Game game = new Game(animal, rescuer);


        Food food1 = new Food("Pedigree");
        Rescuer rescuer1 = new Rescuer("Nick");
        Animal animal1 = new Animal("Berg");


        Rescuer.feed(animal, rescuer, food);




        Rescuer.play(rescuer, animal, activity);
        Rescuer.play(rescuer, animal, activity1);


        Animal animal2 = new Dog("Azorel");
        Animal animal3 = new Cat("Kitty");
        Animal animal4 = new Dog("Grivei");

//        animal1.showMood(); //metoda din clasa Animal
//        animal2.showMood(); //metoda din clasa Dog
//        animal3.showMood(); //metoda din clasa Cat
//        animal4.showMood(); //metoda din clasa Dog
    }


}

