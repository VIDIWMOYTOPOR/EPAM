package Exercises.Dragon;

import java.io.Serializable;

public class Treasure implements Serializable {
    private String name;
    private int value;

    public Treasure(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}