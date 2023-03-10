package designpatterns.observer;

import java.util.ArrayList;

public class StockMarket {
    ArrayList<Channel> observers;

    public StockMarket() {
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
