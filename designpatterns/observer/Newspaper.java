package designpatterns.observer;

public class Newspaper implements Channel{
    public void update(String message) {
        System.out.println("Newspaper: " + message);
    }
}
