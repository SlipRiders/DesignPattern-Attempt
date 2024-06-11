package org.example;

public class AC extends AutoDecorator {
    public AC(AutoAPI auto) {
        super(auto);
    }

    @Override
    public double getPrice() {
        return auto.getPrice() + 1500;
    }

    @Override
    public String getDescription() {
        return auto.getDescription() + ", with Air Conditioning $1500";
    }
}
