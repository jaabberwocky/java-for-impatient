package com.tobias.corejava.chapters.ch03;

public interface IntSequence {
    boolean hasNext();
    int next();

    static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;

        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum/count;
    }

    default String sayWhat() {
        return "Say what!?";
    }
}
