package com.tobias.corejava.exercises.ch02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter -99 to quit!");
        while (i != -99) {
            System.out.print("Enter number: ");
            i = scanner.nextInt();
            System.out.printf("You entered: %s%n",i);
        }
        // nextInt is an acccessor method: does not mutate state
        // nextInt of random class: also accessor


    }
}
