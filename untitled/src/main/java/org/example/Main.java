package org.example;

import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Original adapter test
        Calculatable calculatable = new Calculatable();
        CalculatorAdapter adapter = new CalculatorAdapter(calculatable);

        // Testing the original CalculatorAdapter
        System.out.println("Testing original CalculatorAdapter:");
        testAdapter(adapter);

        // New adapter test
        CalculatorAdapter2 adapter2 = new CalculatorAdapter2();

        // Testing the new CalculatorAdapter2
        System.out.println("Testing new CalculatorAdapter2:");
        testAdapter(adapter2);
    }

    private static void testAdapter(AccumulatableAPI adapter) {
        // Test accumulation function
        List<Double> prices = Arrays.asList(50.0, 30.0, 20.0);  // price list
        double total = adapter.accumulation(prices);
        System.out.println("Total Accumulation: " + total);  // Should output: Total Accumulation: 100.0

        // Test payment function
        double payment = adapter.payment(150.0);
        System.out.println("Change Returned: " + payment);  // Should output: Change Returned: 50.0

        // Test again with different prices
        total = adapter.accumulation(Arrays.asList(25.0, 25.0));
        System.out.println("Total Accumulation: " + total);  // Should output: Total Accumulation: 50.0

        payment = adapter.payment(70.0);
        System.out.println("Change Returned: " + payment);  // Should output: Change Returned: 20.0
    }
}