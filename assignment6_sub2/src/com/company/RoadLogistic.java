package com.company;

public class RoadLogistic implements Logistic{
    @Override
    public Transport createLogistic() {
        return new Truck();
    }
}

