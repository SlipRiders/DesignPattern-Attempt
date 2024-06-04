package org.example;

import java.util.List;

public class CalculatorAdapter implements AccumulatableAPI {
    private final Calculatable calculator;
    private double sum;

    public CalculatorAdapter(Calculatable calc) {
        this.calculator = calc; // 3rd Party App
        this.sum = 0;
    }

    @Override
    public double accumulation(List<Double> prices) {
        sum = 0;
        for (Double itemPrice : prices) {
            sum = this.calculator.operation(CalculatableAPI.OPERATION.ADD, sum, itemPrice);
        }
        return sum;
    }

    @Override
    public double payment(double cash) {
        return this.calculator.operation(CalculatableAPI.OPERATION.SUB, cash, sum);
    }
}