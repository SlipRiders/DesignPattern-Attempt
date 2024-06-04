package org.example;

import java.util.List;


public interface AccumulatableAPI {
    double accumulation(List<Double> itemPrices);
    double payment(double payment);
}