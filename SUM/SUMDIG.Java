package SUM;

import java.util.Scanner;

public class SUMDIG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] results = new long[n];
        for (int i = 0; i < n; i++) {
            results[i] = String.valueOf(sc.nextLong())
                               .chars()
                               .map(c -> c - '0')
                               .sum();
        }
        for (long res : results) {
            System.out.println(res);
        }
    }
}
