package com.tobias.corejava.chapters.ch03;

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
        DigitSequence digitsConverted = (DigitSequence) digits;
        System.out.println(digitsConverted.rest());

        // check for whether obj is desired type (or has type as supertype)
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
    }
}
