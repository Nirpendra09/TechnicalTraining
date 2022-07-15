package com.dit.javaoops;

public class OverflowingStack {
    public static void main(String[] args) {
        overflow();
    }

    static void overflow() {
        overflow();
    }
}
