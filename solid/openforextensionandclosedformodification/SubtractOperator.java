package solid.openforextensionandclosedformodification;

public class SubtractOperator implements Operator {

    @Override
    public double calculate(double a, double b) {
        return a-b;
    }
}
