package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ExampleOfJava8 {




    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        // Populate the inventory with Apple objects

        // Sorting the inventory by weight
        inventory.sort(Comparator.comparing(Apple::getWeight));

        // Now the inventory is sorted by weight
    }
}

class Apple {
    private int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
