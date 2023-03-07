package solid.openforextensionandclosedformodification;

public class Operation {
    public double calculate(double a, double b, char operation) {
        switch (operation) {
            case '+':
                return a+b;
            case '-':
                return a-b;
        }
        /*
         Here if we add new operations, then it will make modifications in the existing code
         and will impact it with possible bugs.
         */
        return 0;
    }
}
