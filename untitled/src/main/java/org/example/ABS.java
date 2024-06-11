package org.example;

public class ABS extends AutoDecorator {
    public ABS(AutoAPI auto) {
        super(auto);
    }

    @Override
    public double getPrice() {
        return auto.getPrice() + 2000;
    }

    @Override
    public String getDescription() {
        return auto.getDescription() + ", with Anti-lock Braking system #2000";
    }
}
