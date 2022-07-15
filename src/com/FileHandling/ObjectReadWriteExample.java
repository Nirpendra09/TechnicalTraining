package com.FileHandling;

import java.io.*;

class Vehicle implements Serializable {
    private String name;
    private int speed;
    private int year;

    public Vehicle(String name, int speed, int year) {
        this.name = name;
        this.speed = speed;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }
}

public class ObjectReadWriteExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Vehicle car = new Vehicle("Car", 100, 2018);

        FileOutputStream fos = new FileOutputStream("D:\\Java-TechnicalTraining\\songs\\sample.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(car);

        oos.close();
        fos.close();

        System.out.println("Object written to file");

        FileInputStream fis = new FileInputStream("D:\\Java-TechnicalTraining\\songs\\sample.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Vehicle car2 = (Vehicle) ois.readObject();
        ois.close();

        System.out.println(car2.getName()+" " + car2.getSpeed()+" " + car2.getYear());
    }
}
