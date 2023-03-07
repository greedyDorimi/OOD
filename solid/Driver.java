package solid;

import solid.interfaceseggregationprinciple.Cylinder;
import solid.interfaceseggregationprinciple.Square;
import solid.liskovprinciple.*;
import solid.openforextensionandclosedformodification.*;
import solid.singleresponsibilityprinciple.BookPrinter;
import solid.singleresponsibilityprinciple.Books;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        single();
        openClose();
        lisokv();
        interfaceSeggregation();
        dependencyInversion();
    }

    public static void single() {
        Books book = new Books("Mansi", "Clean Code", "Use Eraser");
        BookPrinter printer = new BookPrinter();
        printer.printToConsole(book);
    }

    public static void openClose() {
        Calculator calculator = new Calculator();
        double sum = calculator.calculate(2, 3, new AddOperator());
        double diff = calculator.calculate(2, 3, new SubtractOperator());
        double mul = calculator.calculate(2, 3, new MultiplyOperator());

        System.out.printf("%f %f %f\n", sum, diff, mul);

//        Operator operation = new AddOperator();
//        double result = operation.calculate(2, 3);
//        System.out.printf("%f\n", result);
    }

    public static void lisokv() {
        List<Vehicle> vehicles= new ArrayList<Vehicle>();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        vehicles.add(car);
        vehicles.add(bicycle);
        try {
            for(Vehicle vehicle: vehicles) {
                vehicle.startEngine();
            }
            // here it will cause problem with bicycle
        } catch (EngineNotFoundException e) {
            System.out.println(e.getMessage());
        }
        Cycle cycle = new Cycle();
        cycle.startMoving();
        Truck truck = new Truck();
        truck.startEngine();
    }

    public static void interfaceSeggregation() {
        Square square = new Square();
        square.calculateVolume();
        Cylinder cylinder = new Cylinder();
        cylinder.calculateVolume();
    }

    public static void dependencyInversion() {

    }
}
