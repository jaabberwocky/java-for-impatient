package com.tobias.corejava.chapters.ch03;

/**
 * StupidSequence has both Channel and IntSequence
 * as supertypes.
 */
public class StupidSequence implements Channel, IntSequence {
    private boolean isOpen = true;

    @Override
    public void close() {
        isOpen = false;
    }

    @Override
    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public int next() {
        return -99;
    }

    @Override
    public boolean hasNext() {
        return this.isOpen();
    }

    @Override
    public String sayWhat() {
        return "StupidSequence say what!";
    }
}
