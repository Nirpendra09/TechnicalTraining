package com.dit.javaoops;

// upcasting and downcasting in java

class Circle {
    double radius;
    double area;

    Circle() {
    }

    Circle(int radius) {
        this.radius = radius;
    }

    void getAreaOfCircle(int radius) {
        area = 3.14 * radius * radius;
        System.out.println(area);
    }
}

class Square extends Circle {
    double side;
    double area;

    Square(int side) {
        this.side = side;
    }

    void getAreaOfSquare(int side) {
        area = side * side;
        System.out.println(area);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Circle c = new Square(5);
        c.getAreaOfCircle(5);

        Square s = (Square) c;
        s.getAreaOfSquare(10);
    }
}
