package org.example;

public class Calculatable implements CalculatableAPI {
    @Override
    public double operation(OPERATION op, double a, double b) {
        switch (op) {
            case ADD:
                return a + b;
            case SUB:
                return a - b;
            case MULT:
                return a * b;
            case DIV:
                if (b == 0) throw new IllegalArgumentException("Division by zero is not allowed.");
                return a / b;
            default:
                throw new UnsupportedOperationException("The specified operation is not supported.");
        }
    }
}
