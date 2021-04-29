package exercises.ch01;

public class Ex2 {
    public static String normalizeAngleString(int angle) {
        return Integer.toString(angle % 360);
    }

    public static String normalizeAngleStringFloorMod(int angle) {
        return Integer.toString(Math.floorMod(angle, 360));
    }

    public static void main(String[] args) {
        int angle = Integer.parseInt(args[0]);
        System.out.println("Input: " + Integer.toString(angle));
        System.out.println("Normalized (modulus): " + normalizeAngleString(angle));
        System.out.println("Normalized (floorMod): " + normalizeAngleStringFloorMod(angle));
    }
}
