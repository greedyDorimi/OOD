package designpatterns.adapter;

public class MovableAdapterImpl {
    private Movable vehicle;

    public MovableAdapterImpl(Movable vehicle) {
        this.vehicle = vehicle;
    }
    public double convertToKmph(double speed) {
        return (speed*1.609);
    }
    public double getSpeed() {
        return convertToKmph(vehicle.getSpeed());
    }
}
