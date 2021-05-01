package com.tobias.corejava.exercises.ch02;

import org.omg.CORBA.IntHolder;

public class Ex4 {
    // no pointers and thus you cannot swap values like in C++

    public static void main(String[] args) {
        IntHolder i = new IntHolder(1);
        IntHolder j = new IntHolder(2);

        i = j;
        j = i;
    }
}
