package org.fasttrackit;

import org.fasttrackit.domain.Animal;
import org.fasttrackit.domain.Dog;
import org.fasttrackit.persistance.AnimalRepository;
import org.fasttrackit.service.AnimalService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Game {

    private Activity[] activities = new Activity[5];
    private Food[] foods = new Food[5];
    private List<Animal> animals = new ArrayList<>();
    private List<Rescuer> rescuers = new ArrayList<>();
    private AnimalService animalService = new AnimalService();

   private Animal animal = new Animal();


    public void start() throws Exception {
        initRescuer();
        animal.setName(getAnimalNameFromUser());
        animalService.selectAnimal(animal);
        addActivities();
        addFoods();
        animalService.selectAnimal(animal);
        showStats();

        int numberOfRounds = gameLengthFromUser();

        while (animal.getHungerLevel() > 5 && animal.getHappinessLevel() < 5) {

            for (int i = 0; i < numberOfRounds; i++) {
                if (gameNextActionFromUser() == 1) {
                    requireActivity();

                } else {
                    requireFeeding();

                }
            }
            if (animal.getHungerLevel() < 5 || animal.getHappinessLevel() > 5) {
                System.out.println("Game Over");
                animalService.updateAnimal(animal);

                break;
            } else if (animal.getHungerLevel() > 5 || animal.getHappinessLevel() < 5) {
                System.out.println("Well done for today!");
                animalService.updateAnimal(animal);

                break;
            }
        }
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
        System.out.println("1 - Play");
        System.out.println("2 - Feed");
    }

    public void initAnimal() throws SQLException, IOException, ClassNotFoundException {

        animal.setName(getAnimalNameFromUser());
        animal.setAge(3);
        animal.setRace("Beagle");
        animal.setFavActivity("3.Tracking");
        animal.setFavFood("3.Meat");
        animal.setHappinessLevel(ThreadLocalRandom.current().nextInt(1, 5));
        animal.setHungerLevel(ThreadLocalRandom.current().nextInt(6, 10));

        animalService.createAnimal(animal);

    }

    private void initRescuer() {
        Rescuer rescuer = new Rescuer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name for the rescuer: ");
        rescuer.setName(scanner.nextLine());
        rescuers.add(rescuer);
    }

    private String getAnimalNameFromUser() {
        System.out.println("Please enter a name for your Dog: ");
        Scanner scanner = new Scanner(System.in);
        String animalNameFromUser = scanner.nextLine();
        return animalNameFromUser;
    }

    private String requireFeeding() {
        showAvailableFoods();
        try {
            System.out.println("Please enter the number of food you want to feed your pet: ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x - 1 <= foods.length) {
                rescuers.get(0).feed(rescuers.get(0), animal, foods[x - 1]);
            }
        } catch (IndexOutOfBoundsException | NullPointerException | InputMismatchException e) {
            System.out.println("Please enter a valid integer:");
            return requireFeeding();
        }
        return null;
    }

    private String requireActivity() {
        showAvailableActivities();
        try {
            System.out.println("Please enter the index number for the activity you want to play with your pet: ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x - 1 <= activities.length)
                rescuers.get(0).play(rescuers.get(0), animal, activities[x - 1]);

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
        System.out.println("Rescuer name: " + rescuers.get(0).getName());
        System.out.println("Dog name: " + animal.getName());
        System.out.println(animal.getName() + " happiness level is: " + animal.getHappinessLevel());
        System.out.println(animal.getName() + " hunger level is: " + animal.getHungerLevel());
    }
}
