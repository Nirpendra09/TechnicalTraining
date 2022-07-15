package com.dit.javaoops;

class P {
    protected int x;
    P() {
        x = 100;
    }
}

public class Task3 extends P {
    public static void main(String[] args) {
        Task3 t = new Task3();
        System.out.println("before -> " + t.x);
        t.x = 5;
        System.out.println("after -> " + t.x);
    }
}
