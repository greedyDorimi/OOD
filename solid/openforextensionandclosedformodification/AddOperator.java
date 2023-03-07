package solid.openforextensionandclosedformodification;

public class AddOperator implements Operator {

    @Override
    public double calculate(double a, double b) {
        return a+b;
    }
}
