package SUM;

import java.util.Scanner;

public class SUMDIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int n = sc.nextInt(); n-- > 0; )
            System.out.println(sumDivisors(sc.nextLong()));
    }

    static long sumDivisors(long num) {
        long sum = 1, temp = num;
        for (long p = 2; p * p <= num; p++) {
            if (num % p == 0) {
                long pow = 1, powSum = 1;
                while ((num /= p) % p == 0) powSum += (pow *= p);
                sum *= powSum + pow * p;
            }
        }
        return num > 1 ? sum * (1 + num) : sum;
    }
}
