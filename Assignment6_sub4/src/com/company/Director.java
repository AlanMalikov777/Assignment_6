package com.company;

public class Director {
     HouseBuilder builder;

    void setHouse(HouseBuilder builder) {
        this.builder = builder;
    }
    House makeHome(){
        builder.buildDoors();
        builder.buildWalls();
        builder.buildWindows();
        builder.buildRoof();
        builder.buildGarage();

        House home=builder.getHouse();
        return home;
    }
}
