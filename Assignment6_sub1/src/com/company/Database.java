package com.company;

public class Database {
    private static Database instance;
    public String value;
    private Database(String value){
        this.value= value;
    }
    public static Database getInstance(String value){
        if (instance == null){
            instance = new Database(value);
        }
        return Database.instance;
    }
    public void query(String sql){
        System.out.println("this is");
        System.out.println(sql);
}}

