package solid.interfaceseggregationprinciple;

public class Cylinder implements TwoDimensionalShape, ThreeDimensionalShape {
    @Override
    public void calculateArea() {
        System.out.println("Cylinder Area\n");
    }
    @Override
    public void calculateVolume() {
        System.out.println("Cylinder Volume\n");
    }
}
