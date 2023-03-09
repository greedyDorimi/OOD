package designpatterns.factory;

public class Zomato {
    public void order(String food) {
        FoodFactory.getInstance().createFood(food);
    }
}
