package org.solutions;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipes {
    private final Scanner scanner;
    private ArrayList<String> listOfIngredients;
    private ArrayList<Dishes> listOfDishes;

    public Recipes(Scanner scanner) {
        this.scanner = scanner;
        this.listOfIngredients = new ArrayList<>();
        this.listOfDishes = new ArrayList<>();
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        if (!fileName.endsWith(".txt")) {
            fileName = fileName + ".txt";
        }

        try (Scanner recipeScanner = new Scanner(Paths.get(fileName))) {

            String name = "";
            int time = 0;
            ArrayList<String> ingredients = new ArrayList<>();

            while (recipeScanner.hasNextLine()) {
                String line = recipeScanner.nextLine();

                if (line.isEmpty()) {
                    Dishes dish = new Dishes(name, time, ingredients);
                    listOfDishes.add(dish);

                    name = "";
                    time = 0;
                    ingredients = new ArrayList<>();
                    continue;
                }

                if (name.isEmpty()) {
                    name = line;
                } else if (time == 0) {
                    time = Integer.valueOf(line);
                } else {
                    ingredients.add(line);
                }
            }

            if (!name.isEmpty()) {
                Dishes dish = new Dishes(name, time, ingredients);
                listOfDishes.add(dish);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("check " + listOfDishes.size());
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                print();
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();

                System.out.println("Recipes:");
                for (Dishes dish : listOfDishes) {
                    if (dish.getName().contains(word)) {
                        System.out.println(dish);
                    }
                }
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maximumTime = Integer.valueOf(scanner.nextLine());

                System.out.println("Recipes:");
                for (Dishes dish : listOfDishes) {
                    if (dish.getTimeToCook() <= maximumTime) {
                        System.out.println(dish);
                    }
                }
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println("Recipes:");
                for (Dishes dish : listOfDishes) {
                    for (String ing : dish.getIngridents()) {
                        if (ing.toLowerCase().equals(ingredient)) {
                            System.out.println(dish);
                        }
                    }
                }
            }

            if (command.equals("stop")) {
                break;
            }
        }
    }

    public void print() {
        System.out.println("Recipes:");
        for (Dishes dish : listOfDishes) {
            System.out.println(
                    dish.getName() + ", cooking time: " + dish.getTimeToCook()
            );
        }
    }
}
