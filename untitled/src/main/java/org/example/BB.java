package org.example;

public class BB extends AutoDecorator {
    public BB(AutoAPI auto) {
        super(auto);
    }

    @Override
    public double getPrice() {
        return auto.getPrice() + 3000;
    }

    @Override
    public String getDescription() {
        return auto.getDescription() + ", with Bumper to Bumper warrantee $3000";
    }
}
