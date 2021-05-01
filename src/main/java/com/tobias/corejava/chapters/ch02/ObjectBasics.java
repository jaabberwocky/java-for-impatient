package com.tobias.corejava.chapters.ch02;

public class ObjectBasics {
    public static void main(String[] args) {
        Employee e1 = new Employee("James", 45, 1250.50);
        Employee e2 = new Employee("Sarah", 32, 1450.27);
        Employee e3 = new Employee();
        Employee e4 = new Employee(4);
        Employee e5 = new Employee(10.2);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

        System.out.println(e1.equals(e2));
        //noinspection ConstantConditions
        System.out.println(e1 == e1);
    }
}
