package com.FileHandling;

import java.io.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Employee Parametrized constructor");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class ObjectReadWriteDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee ram = new Employee(101, "Ram", 25000);

        // object to byte file: Serialization

        FileOutputStream fo = new FileOutputStream("D:\\Java-TechnicalTraining\\songs\\sample.txt");
        ObjectOutputStream os = new ObjectOutputStream(fo);

        os.writeObject(ram);

        os.close();
        fo.close();

        System.out.println("Object written to file");

        // byte file to object: Deserialization

        FileInputStream fs = new FileInputStream("D:\\Java-TechnicalTraining\\songs\\sample.txt");
        ObjectInputStream oi = new ObjectInputStream(fs);

        Employee e = (Employee) oi.readObject();
        System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
    }
}
