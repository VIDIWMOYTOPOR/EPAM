package Exercises.Gifts;

import java.util.ArrayList;
import java.util.List;

class Gift {
    private List<Sweetness> sweetnessList;
    private Package pac;

    public Gift() {
        sweetnessList = new ArrayList<>();
        pac = new Package("Red", "Cardboard");
    }

    public void addSweetness(Sweetness sweetness) {
        sweetnessList.add(sweetness);
    }

    public List<Sweetness> getSweetnessList() {
        return sweetnessList;
    }

    public Package getPackaging() {
        return pac;
    }

    @Override
    public String toString() {
        return "Gift: [sweetnessList=" + sweetnessList + ", packaging=" + pac + "]";
    }
}
