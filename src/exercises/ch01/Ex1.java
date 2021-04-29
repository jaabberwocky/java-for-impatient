package exercises.ch01;

public class Ex1 {

    public static void main(String[] args) {
        int requestedInt = Integer.parseInt(args[0]);

        String binary = Integer.toBinaryString(requestedInt);
        String octal = Integer.toOctalString(requestedInt);
        String hex = Integer.toHexString(requestedInt);
        String reciprocal = Double.toHexString(1/(double)requestedInt);


        System.out.println("Int: " + Integer.toString(requestedInt));
        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Reciprocal in hex: "+ reciprocal);
    }
}
