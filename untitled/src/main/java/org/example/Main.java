package org.example;

import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculatable calculatable = new Calculatable();

        // create an adapter
        CalculatorAdapter adapter = new CalculatorAdapter(calculatable);

        // test accumulation function
        List<Double> prices = Arrays.asList(50.0, 30.0, 20.0);  // price
        double total = adapter.accumulation(prices);
        System.out.println("Total Accumulation: " + total);  // Total Accumulation: 100.0

        // test payment function
        double payment = adapter.payment(150.0);
        System.out.println("Change Returned: " + payment);  // Change Returned: 50.0

        // test again with different prices
        total = adapter.accumulation(Arrays.asList(25.0, 25.0));
        System.out.println("Total Accumulation: " + total);  // Total Accumulation: 50.0

        payment = adapter.payment(70.0);
        System.out.println("Change Returned: " + payment);  // Change Returned: 20.0
    }
}