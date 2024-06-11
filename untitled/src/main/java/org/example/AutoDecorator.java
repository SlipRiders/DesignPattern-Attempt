package org.example;

public abstract class AutoDecorator implements AutoAPI {
    protected AutoAPI auto;

    public AutoDecorator(AutoAPI auto) {
        this.auto = auto;
    }
}
