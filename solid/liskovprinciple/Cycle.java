package solid.liskovprinciple;

public class Cycle implements VehicleWithoutEngine {

    @Override
    public void startMoving() {
        System.out.println("Cycle is moving\n");
    }
}
