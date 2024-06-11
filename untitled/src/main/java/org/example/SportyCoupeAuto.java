package org.example;

public class SportyCoupeAuto implements AutoAPI {
    private double price;
    private String description;

    public SportyCoupeAuto() {
        price = 20000;  // basic price
        description = "Sporty Coupe $20000";  // basic description
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

