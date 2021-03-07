package com.company;

public abstract class HouseBuilder {
    House house=new House();

    abstract void  buildWalls();
    abstract void buildDoors();
    abstract void buildWindows();
    abstract void buildRoof();
    abstract void buildGarage();
    House getHouse(){
        return house;
    }


}
