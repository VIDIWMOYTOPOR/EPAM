package Exercises.Dragon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex_4 {
    static Scanner scanner = new Scanner(System.in);
    static DragonCave dragonCave;

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Dragon's Cave Menu:");
            System.out.println("1. Create a new dragon's cave");
            System.out.println("2. Load dragon's cave from file");
            System.out.println("3. Save dragon's cave to file");
            System.out.println("4. View all treasures");
            System.out.println("5. Find the most valuable treasure");
            System.out.println("6. Find treasures by value");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createDragonCave();
                    break;
                case 2:
                    loadDragonCave();
                    break;
                case 3:
                    saveDragonCave();
                    break;
                case 4:
                    viewAllTreasures();
                    break;
                case 5:
                    findMostValuableTreasure();
                    break;
                case 6:
                    findTreasuresByValue();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    private static void createDragonCave() {
        dragonCave = new DragonCave();

        for (int i = 1; i <= 100; i++) {
            String name = "Treasure " + i;
            int value = (int) (Math.random() * 1000) + 1;

            Treasure treasure = new Treasure(name, value);
            dragonCave.addTreasure(treasure);
        }

        System.out.println("Dragon's cave with 100 test treasures has been created.");
    }

    private static void loadDragonCave() {
        System.out.print("Enter the file name: ");
        String fileName = scanner.next();

        dragonCave = DragonCave.loadFromFile(fileName);
        if (dragonCave != null) {
            System.out.println("Dragon's cave has been loaded from " + fileName);
        } else {
            System.out.println("Failed to load dragon's cave from " + fileName);
        }
    }

    private static void saveDragonCave() {
        if (dragonCave != null) {
            System.out.print("Enter the file name: ");
            String fileName = scanner.next();

            dragonCave.saveToFile(fileName);
        } else {
            System.out.println("No dragon's cave data to save.");
        }
    }

    private static void viewAllTreasures() {
        if (dragonCave != null) {
            dragonCave.viewTreasures();
        } else {
            System.out.println("No dragon's cave data to view.");
        }
    }

    private static void findMostValuableTreasure() {
        if (dragonCave != null) {
            Treasure mostValuableTreasure = dragonCave.findMostValuableTreasure();
            if (mostValuableTreasure != null) {
                System.out.println("Most valuable treasure:");
                System.out.println(mostValuableTreasure);
            } else {
                System.out.println("No treasures found.");
            }
        } else {
            System.out.println("No dragon's cave data to search.");
        }
    }

    private static void findTreasuresByValue() {
        if (dragonCave != null) {
            System.out.print("Enter the maximum value: ");
            int maxValue = scanner.nextInt();

            List<Treasure> treasures = dragonCave.findTreasuresByValue(maxValue);
            if (!treasures.isEmpty()) {
                System.out.println("Treasures with value up to " + maxValue + ":");
                for (Treasure treasure : treasures) {
                    System.out.println(treasure);
                }
            } else {
                System.out.println("No treasures found.");
            }
        } else {
            System.out.println("No dragon's cave data to search.");
        }
    }
}