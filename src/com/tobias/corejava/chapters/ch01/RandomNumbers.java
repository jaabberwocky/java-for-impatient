package com.tobias.corejava.chapters.ch01;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int numberOfNums = Integer.parseInt(args[0]);
        String s = String.format("%s random numbers requested", numberOfNums);
        System.out.println(s);

        // generate random numbers
        long unixTime = System.currentTimeMillis();
        Random r = new Random();
        r.setSeed(unixTime);
        int ctr = 0;
        while (ctr < numberOfNums) {
            System.out.println(r.nextInt(Integer.MAX_VALUE)); // prevent integer overflow
            ctr++;
        }
    }
}
