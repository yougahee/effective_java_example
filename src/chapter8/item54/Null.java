package chapter8.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Null {
    private final List<Cheese> cheesesInStock = new ArrayList<>();
    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    public List<Cheese> getCheeses() {
        return cheesesInStock.isEmpty() ? null : new ArrayList<>(cheesesInStock);
    }

    public List<Cheese> getCheesesInStock() {
        return new ArrayList<>(cheesesInStock);
    }

    public List<Cheese> getCheese() {
        return cheesesInStock.isEmpty() ? Collections.emptyList() : new ArrayList<>(cheesesInStock);
    }

    public Cheese[] getCheeseArray() {
        return cheesesInStock.toArray(new Cheese[0]);
    }
}

class Cheese {

}
