package com.company;

public class SeaLogistic implements Logistic {
    @Override
    public Transport createLogistic() {
        return new Ship();
    }
}
