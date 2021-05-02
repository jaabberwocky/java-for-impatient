package com.tobias.corejava.chapters.ch03;

public class DigitSequence implements IntSequence {
    private int number;

    /**
     *
     * @param n Number to iterate until (finite sequence)
     */
    public DigitSequence(int n) {
        number = n;
    }

    public boolean hasNext() {
        return number != 0;
    }

    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    public int rest() {
        return number;
    }
}
