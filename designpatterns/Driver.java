package designpatterns;

import designpatterns.adapter.Audi;
import designpatterns.adapter.MovableAdapterImpl;
import designpatterns.builder.Student;
import designpatterns.chainofresponsibility.ATMDispenseChain;
import designpatterns.chainofresponsibility.Currency;
import designpatterns.factory.Swiggy;
import designpatterns.factory.Zomato;
import designpatterns.observer.*;
import designpatterns.singleton.House;
import designpatterns.singleton.SecurityGuard;
import designpatterns.strategy.BubbleSort;
import designpatterns.strategy.InsertionSort;
import designpatterns.strategy.MergeSort;
import designpatterns.strategy.Sorter;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        builder();
        singleton1(); // Use-case: https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
        singleton2();
        factory();
        strategy();
        observer();
        adapter();
        chainofresponsibility();
    }
    public static void builder() {
        Student student = new Student.Builder()
                .name("Mansi")
                .rollNo(26)
                .build();
        System.out.println(student.getName() + " " + student.getRollNo() + " " + student.getEmailId()
                + " " + student.getPhoneNo() + "\n");
    }

    public static void singleton1() {
        House house1 = new House(1);
        House house2 = new House(2);
        house1.printGuard(SecurityGuard.getInstance());
        house2.printGuard(SecurityGuard.getInstance());
    }

    public static void singleton2() {
        House house3 = new House(3);
        House house4 = new House(4);
        house3.printGuard(SecurityGuard.getInstance());
        house4.printGuard(SecurityGuard.getInstance());
    }

    public static void factory() {
        Zomato zomato = new Zomato();
        zomato.order("Salad");
        zomato.order("Chole Bhature");
        Swiggy swiggy = new Swiggy();
        swiggy.order("Salad");
        swiggy.order("Chole Bhature");
    }

    public static void strategy() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7, 4, 3, 9, 2));
        Sorter sorter = new Sorter();
        sorter.sortNumbers(numbers, new BubbleSort());
        sorter.sortNumbers(numbers, new MergeSort());
        sorter.sortNumbers(numbers, new InsertionSort());
    }

    public static void observer() {
        Internet internet = new Internet();
        Radio radio = new Radio();
        Newspaper newspaper = new Newspaper();

        Railway railway = new Railway();
        railway.addObserver(internet);
        railway.addObserver(radio);
        railway.addObserver(newspaper);
        railway.notifyObservers("Train Derailed!");

        StockMarket stockMarket = new StockMarket();
        stockMarket.addObserver(internet);
        stockMarket.notifyObservers("Market Crashed!");
    }

    public static void adapter() {
        MovableAdapterImpl movableAdapterImpl = new MovableAdapterImpl(new Audi());
        System.out.println(movableAdapterImpl.getSpeed());
    }

    public static void chainofresponsibility() {
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
        atmDispenseChain.getChain().dispense(new Currency(510));
    }
}
