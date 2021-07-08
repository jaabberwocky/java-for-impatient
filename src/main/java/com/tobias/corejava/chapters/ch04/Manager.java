package com.tobias.corejava.chapters.ch04;

import com.tobias.corejava.chapters.ch02.Employee;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int age, double salary){
        // override the constructor
        super(name, age, salary);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
