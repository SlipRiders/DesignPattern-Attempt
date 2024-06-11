package org.example;

public class BDM extends AutoDecorator {
    public BDM(AutoAPI auto) {
        super(auto);
    }

    @Override
    public double getPrice() {
        return auto.getPrice() + 3000;
    }

    @Override
    public String getDescription() {
        return auto.getDescription() + ", with Blind-side Detection Monitor $3000";
    }
}
