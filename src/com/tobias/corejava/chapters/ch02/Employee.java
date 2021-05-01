package com.tobias.corejava.chapters.ch02;

public class Employee {
    // there is only one such var per class, aka class variable
    private static int lastId;

    private final int id;
    private String name;
    private int age;
    private double salary;

    {
        // initialization block
        // this is run after obj has been allocated but BEFORE
        // constructors are run
        lastId++;
        this.id = lastId;
    }

    // constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
        this.name = "WorkerBee";
        this.age = 0;
        this.salary = (double)0;
    }

    public Employee(double salary) {
        this.name = "WorkerBee";
        this.age = 0;
        this.salary = salary;
    }

    public Employee (int age) {
        this.name = "WorkerBee";
        this.age = age;
        this.salary = (double) 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee: {id: %s, name: %s, age: %s, salary: %s}",
                Integer.toString(id),name, Integer.toString(age), Double.toString(salary));
    }

    @Override
    public boolean equals(Object e) {
        if (e == this) return true;
        if (!(e instanceof Employee)) return false;

        Employee other = (Employee)e;
        return (this.name.equals(other.getName()) && this.age == other.getAge() && this.salary == other.getSalary());
    }

    @Override
    public int hashCode(){
        String s = name + Integer.toString(age) + Double.toString(salary);
        return s.hashCode();
    }

}
