package Exercises.Dragon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DragonCave implements Serializable {
    private List<Treasure> treasures;

    public DragonCave() {
        this.treasures = new ArrayList<>();
    }

    public void addTreasure(Treasure treasure) {
        treasures.add(treasure);
    }

    public void viewTreasures() {
        System.out.println("Treasures in the dragon's cave:");
        for (Treasure treasure : treasures) {
            System.out.println(treasure);
        }
    }

    public Treasure findMostValuableTreasure() {
        if (treasures.isEmpty()) {
            return null;
        }

        Treasure mostValuableTreasure = treasures.get(0);
        for (Treasure treasure : treasures) {
            if (treasure.getValue() > mostValuableTreasure.getValue()) {
                mostValuableTreasure = treasure;
            }
        }
        return mostValuableTreasure;
    }

    public List<Treasure> findTreasuresByValue(int targetValue) {
        List<Treasure> foundTreasures = new ArrayList<>();
        for (Treasure treasure : treasures) {
            if (treasure.getValue() <= targetValue) {
                foundTreasures.add(treasure);
            }
        }
        return foundTreasures;
    }

    public void saveToFile(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(this);
            System.out.println("Dragon's cave data has been saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error occurred while saving dragon's cave data: " + e.getMessage());
        }
    }

    public static DragonCave loadFromFile(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return (DragonCave) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while loading dragon's cave data: " + e.getMessage());
        }
        return null;
    }
}
