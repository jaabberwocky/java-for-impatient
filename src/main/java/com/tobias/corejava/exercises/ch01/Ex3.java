package com.tobias.corejava.exercises.ch01;

import java.util.ArrayList;
import java.util.Collections;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> myInts;
        myInts = new ArrayList<>();

        for (int i = 0; i < Math.min(3, args.length); i++)
            myInts.add(Integer.parseInt(args[i]));

        int largestValue = Collections.max(myInts);
        System.out.println("Largest value: " + Integer.toString(largestValue));
    }
}
