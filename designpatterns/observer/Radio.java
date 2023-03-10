package designpatterns.observer;

public class Radio implements Channel{
    public void update(String message) {
        System.out.println("Radio: " + message);
    }
}
