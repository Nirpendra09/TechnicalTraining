package com.FileHandling;

import java.io.*;

class Employee_ implements Serializable {
    protected int id;
    protected String name;
    protected double salary;

    public Employee_(int id, String name, double salary) {
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

public class Assignment_8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee_ e1 = new Employee_(1, "John", 5000);
        Employee_ e2 = new Employee_(2, "Smith", 8000);
        Employee_ e3 = new Employee_(3, "David", 9000);
        Employee_ e4 = new Employee_(4, "Peter", 15000);
        Employee_ e5 = new Employee_(5, "James", 18000);

        String path = "D:\\Java-TechnicalTraining\\songs\\sample.txt";

        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Employee_ e : new Employee_[]{e1, e2, e3, e4, e5}) {
            oos.writeObject(e);
        }

        oos.close();
        fos.close();

        System.out.println("Object written to file");

        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("Employees with Salary Greater than 9000:");
        try {
            while (true) {
                Employee_ e = (Employee_) ois.readObject();
                if (e == null) return;
                if (e.getSalary() > 9000) {
                    System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
                }
            }
        } catch (EOFException e) {
            System.out.println("End of file reached");
        }
    }
}
