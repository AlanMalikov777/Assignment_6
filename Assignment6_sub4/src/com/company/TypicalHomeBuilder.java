package com.company;

public class TypicalHomeBuilder extends HouseBuilder {
    @Override
    void buildWalls() {
house.setNumberOfWalls(4);
    }

    @Override
    void buildDoors() {
house.setNumberOfDoors(1);
    }

    @Override
    void buildWindows() {
house.setNumberOfWindows(4);
    }

    @Override
    void buildRoof() {
house.setRoof("house has roof");
    }

    @Override
    void buildGarage() {
house.setGarage("house has garage");
    }
}
