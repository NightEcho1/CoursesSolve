package org.solutions;

import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String commands = scanner.nextLine();

            if (commands.equals("add")) {
                System.out.println("To add ");
                String taskToAdd = scanner.nextLine();
                todoList.add(taskToAdd);
            }

            if (commands.equals("list")) {
                todoList.print();
            }

            if (commands.equals("remove")) {
                System.out.println("Which one is removed? ");
                int numberToRemove = Integer.valueOf(scanner.nextLine());
                todoList.remove(numberToRemove);
            }

            if (commands.equals("stop")) {
                break;
            }
        }
    }
}
