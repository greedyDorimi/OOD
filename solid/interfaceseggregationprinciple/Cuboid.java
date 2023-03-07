package solid.interfaceseggregationprinciple;

public class Cuboid implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("Cuboid Area\n");
    }

    @Override
    public void calculateVolume() {
        System.out.println("Cuboid Volume\n");
    }
}
