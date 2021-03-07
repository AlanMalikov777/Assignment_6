package com.company;



public class Main {

    public static void main(String[] args) {
Transport transport1=new Truck();
transport1.deliver();
System.out.println("---------------------");
Transport transport2=new Ship();
transport2.deliver();
System.out.println("---------------------");
Logistic logistic1=new RoadLogistic();
Transport transport3= logistic1.createLogistic();
transport3.deliver();
System.out.println("---------------------");
Logistic logistic2=new SeaLogistic();
Transport transport4=logistic2.createLogistic();
transport4.deliver();

    }
}
