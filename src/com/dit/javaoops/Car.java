package com.dit.javaoops;

class Vehicle {
    int NoOfTyres ;
    String type;
    Vehicle() {
        NoOfTyres = 0;
        type = "None";
    }
    Vehicle(int n, String t) {
        NoOfTyres = n;
        type = t;
    }
    void print() {
        System.out.println("No of Tyres : " + NoOfTyres);
        System.out.println("Type : " + type);
    }
}
public class Car extends Vehicle {
    int price;
    String color;
    Car() {
        super(4, "Car");
    }
    Car(int price, String color) {
        this();
        this.price = price;
        this.color = color;
    }
    void print() {
        System.out.println("No of Tyres : " + NoOfTyres);
        System.out.println("Type : " + type);
        System.out.println("Price: "+ price);
        System.out.println("Color: "+ color);
    }

    public static void main(String[] args) {
        Car c = new Car(40000000, "Red");
        c.print();
    }
}
