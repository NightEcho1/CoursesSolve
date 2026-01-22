package org.solutions;

import java.util.Scanner;

public class UserInterfaceContainers {
    private Container first;
    private Container second;
    private Scanner scanner;


    public UserInterfaceContainers(Container first, Container second, Scanner scanner) {
        this.first = first;
        this.second = second;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("Command: ");

            String line = scanner.nextLine();
            if (line.equals("quit")) {
                break;
            }

            String[] parts = line.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("remove")) {
                first.remove(amount);
            }

            if (command.equals("move")) {
                System.out.print("Move to which container (1 or 2)? ");
                int target = Integer.parseInt(scanner.nextLine());

                if (target == 1) {
                    second.move(amount, first);
                } else if (target == 2) {
                    first.move(amount, second);
                }
            }
        }
    }
}

