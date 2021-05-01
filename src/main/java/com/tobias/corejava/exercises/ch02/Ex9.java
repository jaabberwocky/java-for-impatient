package com.tobias.corejava.exercises.ch02;

public class Ex9 {
    public static void main(String[] args) {
        Car c = new Car(0, 15, 10);
        c.drive(5);
        c.drive(15);
        c.drive(75);
        System.out.println(c);

        c.addGas(5.0);
        System.out.println(c);
    }


}
