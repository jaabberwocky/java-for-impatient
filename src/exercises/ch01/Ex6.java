package exercises.ch01;

import java.math.BigInteger;

public class Ex6 {

    private static BigInteger fac(int n) {
        BigInteger accum = BigInteger.valueOf(1L);
        return fac_helper(n, accum);
    }

    private static BigInteger fac_helper(int n, BigInteger accum) {
        if (n == 1) {
            return accum;
        }
        return fac_helper(n-1, accum.multiply(BigInteger.valueOf((long) n)));
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        BigInteger fac = fac(n);

        String s = String.format("Fac of %s is %s", Integer.toString(n), fac.toString());
        System.out.println(s);
    }
}
