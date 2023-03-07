package solid.liskovprinciple;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Started\n");
    }
}
