package solid.interfaceseggregationprinciple;

public class Circle implements TwoDimensionalShape {
    @Override
    public void calculateArea() {
        System.out.println("Circle Area\n");
    }
}
