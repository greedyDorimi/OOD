package designpatterns.observer;

import java.util.ArrayList;

public class Railway {
    ArrayList<Channel> observers;

    public Railway() {
        observers = new ArrayList<>();
    }
    public void addObserver(Channel observer) {
        observers.add(observer);
    }

    public void removeObserver(Channel observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for(Channel observer: observers) {
            observer.update(message);
        }
    }
}
