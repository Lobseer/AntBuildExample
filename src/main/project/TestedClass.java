package project;

public class TestedClass {
    public double divide(double dividend, double divisor) {
        if (divisor == 0) throw new ArithmeticException();
        return dividend / divisor;
    }
}
