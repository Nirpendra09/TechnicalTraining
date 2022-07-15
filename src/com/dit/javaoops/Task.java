package com.dit.javaoops;

class Parent {
    String name;

}

public class Task extends Parent {
    String name;
    Task() {
        this.name = "Child";
        super.name = "parent";
    }

    void print() {
        System.out.println("Child -> "+this.name);
        System.out.println("Parent -> "+super.name);
    }

    public static void main(String[] args) {
        Task t = new Task();
        t.print();
    }
}
