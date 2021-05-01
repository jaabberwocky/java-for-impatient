package com.tobias.corejava.exercises.ch02;

public class Ex5 {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(4,5);
        Point p3 = new Point(3,4);
        Point p4 = p3.translate(1,3).scale(0.5);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p4);
    }
}
