package solid.liskovprinciple;

public class Truck implements VehicleWithEngine {
    @Override
    public void startEngine() {
        System.out.println("Truck is moving\n");
    }
}
