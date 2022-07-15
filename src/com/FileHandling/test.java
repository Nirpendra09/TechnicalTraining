package com.FileHandling;

import java.io.*;

class Employee__ implements Serializable {
    private int id;
    private String name;
    private double salary;

    public Employee__(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee__ e1 = new Employee__(1, "John", 5000);
        Employee__ e2 = new Employee__(2, "Smith", 8000);
        Employee__ e3 = new Employee__(3, "David", 9000);
        Employee__ e4 = new Employee__(4, "Peter", 15000);
        Employee__ e5 = new Employee__(5, "James", 18000);

        String path = "D:\\Java-TechnicalTraining\\songs\\sample.txt";

        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(e1);
        oos.writeObject(e2);
        oos.writeObject(e3);
        oos.writeObject(e4);
        oos.writeObject(e5);

        oos.close();
        fos.close();

        System.out.println("Object written to file");

        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("Employeee with salary > 9000");
        Employee__ e6 = (Employee__) ois.readObject();
        checkConditionAndPrint(e6);
        Employee__ e7 = (Employee__) ois.readObject();
        checkConditionAndPrint(e7);
        Employee__ e8 = (Employee__) ois.readObject();
        checkConditionAndPrint(e8);
        Employee__ e9 = (Employee__) ois.readObject();
        checkConditionAndPrint(e9);
        Employee__ e10 = (Employee__) ois.readObject();
        checkConditionAndPrint(e10);
    }

    static void checkConditionAndPrint(Employee__ e) {
        if (e.getSalary() > 9000) {
            System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
        }
    }
}
