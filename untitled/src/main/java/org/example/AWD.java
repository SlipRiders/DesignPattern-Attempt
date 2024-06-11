package org.example;

public class AWD extends AutoDecorator {
    public AWD(AutoAPI auto) {
        super(auto);
    }

    @Override
    public double getPrice() {
        return auto.getPrice() + 2500;
    }

    @Override
    public String getDescription() {
        return auto.getDescription() + ", with All Wheel Drive $2500";
    }
}

