package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj = new RWOnly();
        //obj.name = "Krishna";
        //'name' has private access in 'com.driver.RWOnly'

        obj.setName("Singh");
        System.out.println(obj.getName());
    }
}