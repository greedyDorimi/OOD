package designpatterns.factory;

import java.util.Objects;

public class FoodFactory {

    private static FoodFactory INSTANCE = null;
    public static FoodFactory getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new FoodFactory();
        }
        return INSTANCE;
    }
    public void createFood(String food) {
        if(Objects.equals(food, "Salad")) {
            new Salad().prepare();
        } else if (Objects.equals(food, "Chole Bhature")) {
            new CholeBhature().prepare();
        } else {
            System.out.println("Food not exists!");
        }
    }
}
