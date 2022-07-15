package com.dit.javaoops;

interface Print {
    void printing();
}

interface Show {
    void display();
}

class ChildUpdated implements Print, Show {
    @Override
    public void display() {
        System.out.println("Display method of show interface");
    }

    @Override
    public void printing() {
        System.out.println("Printing method of print interface");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        ChildUpdated c = new ChildUpdated();
        c.printing();
        c.display();
    }
}
