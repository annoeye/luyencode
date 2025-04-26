package POWER;

import java.util.Scanner;

public class POWER1 {
    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long n = sc.nextLong();
        System.out.println(modularExponentiation(a, n));
    }

    private static long modularExponentiation(long base, long exponent) {
        long result = 1;
        base = base % POWER1.MOD;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % POWER1.MOD;
            }
            base = (base * base) % POWER1.MOD;
            exponent = exponent / 2;
        }
        return result;
    }
}