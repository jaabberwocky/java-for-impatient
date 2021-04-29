package exercises.ch01;

public class Ex4 {
    static double maxDouble(double f) {
        double next = Math.nextUp(f);
        while(Double.isFinite(next)) {
            f = next;
            next = Math.nextUp(f);
        }
        return f;
    }
    public static void main(String[] args) {
        double smallestDoubleValue = Math.nextUp((double)0);
        double largestDoubleValue = maxDouble(1.0);

        String formattedString = String.format("Largest = %s\nSmallest = %s",
                Double.toString(largestDoubleValue), Double.toString(smallestDoubleValue));
        System.out.println(formattedString);
    }
}
