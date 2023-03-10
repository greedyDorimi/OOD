package designpatterns.observer;

public class Internet implements Channel{
    public void update(String message) {
        System.out.println("Internet: " + message);
    }
}
