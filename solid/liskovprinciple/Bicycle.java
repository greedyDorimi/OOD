package solid.liskovprinciple;

public class Bicycle implements Vehicle {
    @Override
    public void startEngine() throws EngineNotFoundException {
        throw new EngineNotFoundException("Engine Missing");
    }
}
