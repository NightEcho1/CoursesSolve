package org.solutions;

import java.util.Scanner;

public class BirdUI {
    private final Scanner scanner;
    private final BirdDatabase birdDatabase;

    public BirdUI(Scanner scanner, BirdDatabase birdDatabase) {
        this.scanner = scanner;
        this.birdDatabase = birdDatabase;
    }

    public void start() {

        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                Bird newBird = new Bird(name, latinName);
                birdDatabase.add(newBird);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String nameToObeservate = scanner.nextLine();
                birdDatabase.addObeservation(nameToObeservate);
            }

            if (command.equals("All")) {
                birdDatabase.print();
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String nameOfOneBird = scanner.nextLine();
                birdDatabase.printOne(nameOfOneBird);
            }

            if (command.equals("Quit")) {
                break;
            }
        }
    }
}
