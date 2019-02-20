package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Game {
    private Rescuer rescuer;
    private Animal animal;
    private Vet vet;


    public Activity[] activities = new Activity[5];
    public Food[] foods = new Food[5];

    public Game(Animal animal, Rescuer rescuer) {
        this.animal = animal;
        this.rescuer = rescuer;
    }

    public Game(Animal animal, Vet vet) {
        this.animal = animal;
        this.vet = vet;
    }

    public Game(Animal animal) {
        this.animal = animal;
    }

    public Game() {
    }

    Dog dog = new Dog("Pet1");
    Rescuer rescuer1 = new Rescuer();

    public void start() {
        rescuer1.setName(initRescuer());
        dog.setName(nameAnimal());
        dog.setFavActivity("01.Aport");
        dog.setFavFood("03.Meat");
        dog.happinessLevel = ThreadLocalRandom.current().nextInt(0, 5);
        dog.hungerLevel = ThreadLocalRandom.current().nextInt(5, 10);

        int numberOfRounds = gameLengthFromUser();
        showStats();
        addActivities();
        addFoods();
gameNextActionFromUser();
//        while (dog.happinessLevel > 5 && dog.hungerLevel < 5) {
//            int i;
//            for (i = 0, i <= numberOfRounds, i++) {
//                gameNextActionFromUser();
//                if (gameNextActionFromUser() == 1) {
//                    requireActivity();
//                } else if (gameNextActionFromUser() == 2) {
//                    requireFeeding();
//                }
//
//
//            }
//
//        }
        requireFeeding();
        requireActivity();

    }

    private int gameLengthFromUser() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number of actions: ");
            int numberOfActions = scanner.nextInt();
            return numberOfActions;
        } catch (IndexOutOfBoundsException | NullPointerException | InputMismatchException e) {
            System.out.println("Please enter a valid integer!");
            return gameLengthFromUser();
        }
    }

    private int gameNextActionFromUser() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the index for the next action: ");
            availableActions();
            int actionFromUser = scanner.nextInt();
            return actionFromUser;
        } catch (IndexOutOfBoundsException | NullPointerException | InputMismatchException e) {
            System.out.println("Please enter a valid integer!");
            return gameNextActionFromUser();

        }
    }

    private void availableActions() {
        System.out.println("1.Play");
        System.out.println("2.Feed");
    }

    private void initAnimal() {
        Animal dog = new Dog("Rex");
        dog.setAge(3);
        dog.setRace("Beagle");
        dog.setFavActivity("Track");
        dog.setFavFood("3.Meat");

    }

    private String initRescuer() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter a name for the rescuer: ");
            String rescuerNameFromUser = scanner.nextLine();
            return rescuerNameFromUser;
        } catch (InputMismatchException e) {
            System.out.println("Try again");
            return initRescuer();
        }
    }

    private String nameAnimal() {
        System.out.println("Please enter a name for your Dog: ");
        Scanner scanner = new Scanner(System.in);
        String animalNameFromUser = scanner.nextLine();
        return animalNameFromUser;
    }

    private String requireFeeding() {
        System.out.println("Your pet is hungry");
        showAvailableFoods();
        try {
            System.out.println("Please enter the number of food you want to feed your pet: ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x - 1 <= foods.length) {
                rescuer.feed(rescuer1, dog, foods[x - 1]);
            }
        } catch (IndexOutOfBoundsException | NullPointerException | InputMismatchException e) {
            System.out.println("Please enter a valid integer:");
            return requireFeeding();
        }
        return null;
    }

    private String requireActivity() {
        System.out.println("Your pet needs to play");
        showAvailableActivities();
        try {
            System.out.println("Please enter the index number for the activity you want to play with your pet: ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x - 1 <= activities.length) {
                rescuer.play(rescuer1, dog, activities[x - 1]);
            }
        } catch (IndexOutOfBoundsException | NullPointerException | InputMismatchException e) {
            System.out.println("Please enter a valid integer:");
            return requireActivity();
        }
        return null;
    }

    private void addActivities() {
        Activity activity = new Activity("1.Aport");
        Activity activity1 = new Activity("2.Frisbee");
        Activity activity2 = new Activity("3.Tracking");
        Activity activity3 = new Activity("4.Swimming");
        activities[0] = activity;
        activities[1] = activity1;
        activities[2] = activity2;
        activities[3] = activity3;
    }

    private void showAvailableActivities() {
        System.out.println("Available activities for your pet are: ");
        for (Activity activity : activities) {
            if (activity != null) {
                System.out.println(activity.getName());
            }
        }
    }

    private void addFoods() {
        Food food = new Food("1.Purina");
        Food food1 = new Food("2.Pedigree");
        Food food2 = new Food("3.Meat");
        foods[0] = food;
        foods[1] = food1;
        foods[2] = food2;
    }

    private void showAvailableFoods() {
        System.out.println("Available foods for your pet are: ");
        for (Food food : foods) {
            if (food != null) {
                System.out.println(food.getName());
            }
        }
    }

    private void showStats() {
        System.out.println("Rescuer name: " + rescuer1.getName());
        System.out.println("Dog name: " + dog.getName());
        System.out.println(dog.getName() + " happiness level is: " + dog.happinessLevel);
        System.out.println(dog.getName() + " hunger level is: " + dog.hungerLevel);
    }


    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }


}
