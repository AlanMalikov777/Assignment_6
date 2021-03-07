package com.company;

public class House {
    private int numberOfWalls;
    private int numberOfDoors;
    private int numberOfWindows;
    private String Roof;
    private String Garage;

    public void setNumberOfWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setRoof(String roof) {
        this.Roof = roof;
    }

    public void setGarage(String garage) {
        this.Garage = garage;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    @Override
    public String toString() {
        return "House{" +
                "Number Of Walls=" + numberOfWalls +
                ", Number Of Doors=" + numberOfDoors +
                ", Number Of Windows=" + numberOfWindows +
                ", Roof='" + Roof + '\'' +
                ", Garage='" + Garage + '\'' +
                '}';
    }
}
