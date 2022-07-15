package com.dit.javaoops;

interface Show_Interface {
    static void show() {
        System.out.println("Showing from interface");
    }
}

public class MethodInInterface {
    public static void main(String[] args) {
        Show_Interface.show();
    }
}
