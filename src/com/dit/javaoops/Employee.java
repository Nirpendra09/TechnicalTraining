package com.dit.javaoops;

public class Employee {
    private final String companyName;
    private int id;
    private String name;
    private int basicSalary;

    Employee() {
        this.companyName = "XYZ";
    }

    Employee(int id, String name, int basicSalary) {
        this();
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public static void main(String[] args) {
        Employee e = new Employee(1, "Ram", 10000);

        e.print();

        System.out.println("***********************************************");

        e.setBasicSalary(900000);
        System.out.println("Modified basic salary" + e.getBasicSalary());

        System.out.println("***********************************************");
        e.printSalarySlip();
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    void print() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("basicSalary : " + basicSalary);
        System.out.println("companyName: " + companyName);
    }

    void printSalarySlip() {
        double HRA = 0.3 * basicSalary;
        double DA = 0.2 * basicSalary;
        double TA = 0.1 * basicSalary;
        double MA = 0.15 * basicSalary;
        double PF = 0.05 * basicSalary;
        double grossSalary = basicSalary + HRA + DA + TA + MA;
        double tax;

        if (grossSalary > 900000) {
            tax = grossSalary * 0.3;
            grossSalary -= tax;
        } else if (grossSalary > 700000) {
            tax = grossSalary * 0.2;
            grossSalary -= tax;
        } else if (grossSalary >= 500000) {
            tax = grossSalary * 0.1;
            grossSalary -= tax;
        } else {
            tax = 0;
            grossSalary -= tax;
        }
        double netSalary = grossSalary - PF;

        System.out.println("HRA : " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("TA: " + TA);
        System.out.println("MA: " + MA);
        System.out.println("PF: " + PF);
        System.out.println("grossSalary: " + grossSalary);
        System.out.println("Tax : " + tax);
        System.out.println("Net Salary : " + netSalary);
    }
}
