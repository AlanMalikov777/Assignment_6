package com.company;

public class Main {

    public static void main(String[] args) {
        Database foo = Database.getInstance("Bar");
        foo.query("SELECT ...");
//        Database database=new Database();
        Database bar = Database.getInstance("Foo");
        bar.query("Delete ...");
        System.out.println(foo.value);
        System.out.println(bar.value);
        System.out.println(foo);
        System.out.println(bar);
    }
}
