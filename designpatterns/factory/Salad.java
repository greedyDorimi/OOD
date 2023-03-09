package designpatterns.factory;

public class Salad implements Food{
    @Override
    public void prepare() {
        System.out.println("Salad\n");
    }
}
