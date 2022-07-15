package com.dit.javaoops;


public class Asignment4_Multilevel {
    public static void main(String[] args) {
        Person p = new Person("Nirpendra", 20, "Male");
        Student s = new Student("Nirpendra", 20, "Male", 8.5, "BT-CSE");
        Employee e = new Employee("RAJ", 25, "Male", 8.5, "BT- CSE", 15, "School of Computing");
        System.out.println("Person Object");
        p.print();
        System.out.println();
        System.out.println("Student Object");
        s.print();
        System.out.println();
        System.out.println("Employee Object");
        e.print();

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

    static class Student extends Person {
        double Grade;
        String MAJOR;

        public Student() {
            super();
            Grade = 0;
            MAJOR = "Default";
        }

        public Student(String name, int age, String gender, double grade, String mAJOR) {
            super(name, age, gender);
            Grade = grade;
            MAJOR = mAJOR;
        }

        void print() {
            System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + Gender + "\nSAP ID: " + Grade + "\nMajor: " + MAJOR);
        }
    }

    static class Employee extends Student {
        int EmpNo;
        String deptartment;

        public Employee(String name, int age, String gender, double grade, String mAJOR, int empNo, String deptartment) {
            super(name, age, gender, grade, mAJOR);
            EmpNo = empNo;
            this.deptartment = deptartment;
        }

        public Employee() {
            super();
            EmpNo = 0;
            this.deptartment = "Default";
        }

        void print() {
            System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + Gender + "\nEmployee id: " + EmpNo + "\nDepartment: " + deptartment + "\nSAPID: " + Grade + "\nMajor: " + MAJOR);
        }
    }
}
