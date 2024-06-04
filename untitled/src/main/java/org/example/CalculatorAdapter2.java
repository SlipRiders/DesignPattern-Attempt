package org.example;

import java.util.List;

//class adapter
public class CalculatorAdapter2 extends Calculatable implements AccumulatableAPI {
    private double sum;

    @Override
    public double accumulation(List<Double> prices) {
        sum = 0; // Reset sum
        for (Double itemPrice : prices) {
            sum = operation(OPERATION.ADD, sum, itemPrice);
        }
        return sum;
    }

    @Override
    public double payment(double cash) {
        double result = operation(OPERATION.SUB, cash, sum);
        sum = 0; // Optionally reset sum after payment
        return result;
    }
}
