package com.dit.javaoops;

public class Assignment4_Hirarchical {
    public static void main(String[] args) {

        Person p = new Person("Nirpendra", 20, "Male");
        Employee e = new Employee(15, "School of Computing", "RAJ", 25, "Male");
        Student s = new Student("Nirpendra", 20, "Male", 1000012469, "BT- CSE");
        System.out.println("Person Object");
        p.print();
        System.out.println();
        System.out.println("Employee Object");
        e.print();
        System.out.println();
        System.out.println("Student Object");
        s.print();
    }

    static class Person {
        String name;
        int age;
        String Gender;

        public Person() {
            this.name = "Default";
            this.age = 0;
            Gender = "Default";
        }

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            Gender = gender;
        }

        void print() {
            System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + Gender);
        }
    }

    static class Employee extends Person {
        int EmpNo;
        String deptartment;

        public Employee(int empNo, String deptartment, String name, int age, String gender) {
            super(name, age, gender);
            EmpNo = empNo;
            this.deptartment = deptartment;
        }

        public Employee() {
            super();
            EmpNo = 0;
            this.deptartment = "Default";
        }

        void print() {
            System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + Gender + "\nEmployee id: " + EmpNo + "\nDepartment: " + deptartment);
        }
    }

    static class Student extends Person {
        long SapId;
        String MAJOR;

        public Student(String name, int age, String gender, long sapId, String mAJOR) {
            super(name, age, gender);
            SapId = sapId;
            MAJOR = mAJOR;
        }

        public Student() {
            super();
            SapId = 0;
            MAJOR = "Default";
        }

        void print() {
            System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + Gender + "\nSAP ID: " + SapId + "\nMajor: " + MAJOR);
        }
    }
}
