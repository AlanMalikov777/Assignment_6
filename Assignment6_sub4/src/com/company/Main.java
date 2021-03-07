package com.company;

public class Main {

    public static void main(String[] args) {
        Director director=new Director();
        director.setHouse(new TypicalHomeBuilder());
        House house=director.makeHome();
        System.out.println(house.toString());
    }
}
