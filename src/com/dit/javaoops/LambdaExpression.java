package com.dit.javaoops;

interface Addition {
    int add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Addition add1 = (a, b) -> (a + b);
        System.out.println(add1.add(10, 20));
    }
}
