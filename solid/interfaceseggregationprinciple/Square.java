package solid.interfaceseggregationprinciple;

public class Square implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("Square Area\n");
    }

    @Override
    public void calculateVolume() {
        /*
            Here unnecessary we need to implement volume function
         */
    }
}
