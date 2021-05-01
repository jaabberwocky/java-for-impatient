package com.tobias.corejava.exercises.ch02;

import java.time.DayOfWeek;
import java.time.LocalDate;

// Implements Ex1
public class Ex1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        int month;
        if (args.length >= 2) {
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        } else {
            month = date.getMonthValue();
        }
        String s = String.format("Year [%s] Month [%s]",
                date.getYear(),
                date.getMonthValue());
        System.out.println(" " + s);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday

        // skip this if first day of month starts on Sunday
        if (value != 7) {
            System.out.print("    ");
            for (int i = 1; i < value; i++) {
                System.out.print("    ");
            }
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 7)
            System.out.println();
    }
}
