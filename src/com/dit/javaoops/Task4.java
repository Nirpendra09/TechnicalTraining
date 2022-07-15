package com.dit.javaoops;
class GrandFather {
    String firstName;
    String LastName;
    int age;
    GrandFather() {
        firstName = "GrandFather";
        LastName = "lastname";
        age = 85;
        System.out.println("Name: "+ firstName + "last Name : " + LastName);
    }
}
class Father extends GrandFather {
    String firstName;
    int age;
    Father() {
        firstName = "father";
        age = 45;
        System.out.println("Name: "+ firstName + "last Name : " + LastName);
    }
}
class Child extends  Father {
    String firstName;
    int age;
    Child() {
        firstName="Child";
        age = 15;
        System.out.println("Name: "+ firstName + "last Name : " + LastName);
    }
}
public class Task4 {
    public static void main(String[] args) {
         Child c = new Child();
    }
}
