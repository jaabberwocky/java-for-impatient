package com.tobias.corejava.chapters.ch04;

import com.tobias.corejava.chapters.ch02.Employee;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Smith", 42, 150000);
        Employee e = new Employee("James", 31, 75000);

        m.setBonus(1000);

        System.out.println(m.getSalary());
    }
}
