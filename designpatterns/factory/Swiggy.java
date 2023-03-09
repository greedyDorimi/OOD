package designpatterns.factory;

public class Swiggy {
    public void order(String food) {
        FoodFactory.getInstance().createFood(food);
    }
}
