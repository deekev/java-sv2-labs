package collectionslist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {

    private List<Food> foods = new LinkedList<>();

    public List<Food> getFoods() {
        return new ArrayList<>(foods);
    }

    public void addFood(Food food) {
        foods.add(food);
    }

    public void sellFirst(Food food) {
        if (food.getExpirationDate().equals(LocalDate.now())) {
            foods.add(0, food);
        } else {
            foods.add(food);
        }
    }
}