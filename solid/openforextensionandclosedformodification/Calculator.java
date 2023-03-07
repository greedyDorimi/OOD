package solid.openforextensionandclosedformodification;

public class Calculator {
    public double calculate(double a, double b, Operator operator) {
        return operator.calculate(a, b);
    }
}
