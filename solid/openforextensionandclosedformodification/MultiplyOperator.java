package solid.openforextensionandclosedformodification;

public class MultiplyOperator implements Operator {

    @Override
    public double calculate(double a, double b) {
        return a*b;
    }
}
