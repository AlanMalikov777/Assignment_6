package com.company;

public class Main {

    public static void main(String[] args) {
    System.out.println("Victorian furniture");
    FurnitureFactory furnitureFactory1=new VictorianFurnitureFactory();
    Chair chair1=furnitureFactory1.createChair();
    Sofa sofa1=furnitureFactory1.createSofa();
    CoffeeTable coffeeTable1=furnitureFactory1.createCoffeeTable();
    System.out.println("Chair");
    chair1.hasLegs();
    chair1.sitOn();
    System.out.println("Sofa");
    sofa1.sit();
    System.out.println("Coffee table");
    coffeeTable1.use();
    System.out.println("----------------------------------------");
    System.out.println("Modern furniture");
    FurnitureFactory furnitureFactory2=new ModernFurnitureFactory();
    Chair chair2=furnitureFactory2.createChair();
    Sofa sofa2=furnitureFactory2.createSofa();
    CoffeeTable coffeeTable2=furnitureFactory2.createCoffeeTable();
    System.out.println("Chair");
    chair2.hasLegs();
    chair2.sitOn();
    System.out.println("Sofa");
    sofa2.sit();
    System.out.println("Coffee table");
    coffeeTable2.use();



        }
}
