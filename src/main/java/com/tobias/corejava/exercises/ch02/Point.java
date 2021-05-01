package com.tobias.corejava.exercises.ch02;

/**
 * Point class representing x and y coordinates in Cartesian coordinate space.
 */
public final class Point {
    private double x = 0;
    private double y = 0;

    /**
     *
     * @param x x coordinate
     * @param y y coordinate
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Default constructor to origin.
     */
    public Point() {
        // rely on init values
    }

    /**
     *
     * @return x coordinate
     */
    public double getX() {
        return this.x;
    }

    /**
     *
     * @return y coordinate
     */
    public double getY() {
        return this.y;
    }

    /**
     *
     * @param moveX increases X coordinate in <code>moveX</code>
     * @param moveY increases Y coordinate in <code>moveY</code>
     * @return new <code>Point</code> with modified coordinates
     */
    public Point translate(double moveX, double moveY) {
        return new Point(x + moveX, y + moveY);
    }

    /**
     *
     * @param factor Scales both x and y coordinates by <code>factor</code>
     * @return new <code>Point</code> with modified coordinates
     */
    public Point scale(double factor) {
        return new Point(x * factor, y * factor);
    }

    @Override
    public String toString(){
        return String.format("Point {%s, %s}", this.getX(), this.getY());
    }
}
