package com.tobias.corejava.chapters.ch03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SquareSequence sq = new SquareSequence();
        double sqAvg = IntSequence.average(sq, 25031);
        System.out.println("Square:" + sqAvg);

        FibonacciSequence fib = new FibonacciSequence();
        double fibAvg = IntSequence.average(fib, 23);
        System.out.println("Fib:" + fibAvg);

        IntSequence digits = new DigitSequence(17290); // notice that interface type is used
        double digitsAvg = IntSequence.average(digits, 10);
        System.out.println("Digits: " + digitsAvg);

        // need to cast
        // can only cast an object to its actual class or one of its supertypes
        //noinspection CastCanBeRemovedNarrowingVariableType
        DigitSequence digitsConverted = (DigitSequence) digits;
        System.out.println(digitsConverted.rest());

        // check for whether obj is desired type (or has type as supertype)
        //noinspection ConstantConditions
        if (sq instanceof IntSequence) {
            System.out.println("SquareSequence has IntSequence as supertype");
        }

        // using StupidSequence which implements two
        // interfaces
        IntSequence ss = new StupidSequence();
        int ctr = 0;

        while (ss.hasNext()) {
            if (ctr == 10) {
                break;
            } else {
                System.out.println(ss.next());
            }
            ctr++;
        }

        // checking default methods
        System.out.println(fib.sayWhat());
        System.out.println(sq.sayWhat());
        System.out.println(ss.sayWhat());

        // lambda expressions
        var myFirstString = "Hello";
        var mySecondString = "World";
        ArrayList<String> arr = new ArrayList<>();
        arr.add(myFirstString);
        arr.add(mySecondString);
        arr.forEach((word) -> System.out.println(word.length()));

    }
}
