package com.tobias.corejava.chapters.ch03;

public class FibonacciSequence implements IntSequence {
    private int count;
    private int previousNum;
    private int secondPreviousNum;

    @Override
    public int next() {
        if (count == 0) {
            count++;
            return 0;
        } else if (count == 1) {
            count++;
            previousNum = 1;
            return 1;
        } else {
            count++;
            int tmp = previousNum;
            int returnVal = previousNum + secondPreviousNum;
            previousNum = returnVal;
            secondPreviousNum = tmp;
            return returnVal;
        }
    }

    @Override
    public boolean hasNext() {
        return true;
    }
}
