package chapter01.task06;

import java.math.BigInteger;

public class Task06 {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.ONE;
        for (int n = 1; n <= 1000; n++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(n));
        }
        System.out.println(bigInteger);
    }
}