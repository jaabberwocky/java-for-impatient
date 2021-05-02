package com.tobias.corejava.exercises.ch03;

public class Employee implements Measurable {
    private int salary;
    private String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public double getMeasure() {
        return (double) this.salary;
    }

    @Override
    public String toString() {
        return String.format("Employee {name: %s, salary: %s}", name, salary);
    }
}
