package com.tobias.corejava.chapters.ch03;

public class SquareSequence implements IntSequence {
    private int i; // init to 0

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        i++;
        return i * i;
    }
}
