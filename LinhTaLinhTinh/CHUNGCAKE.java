package LinhTaLinhTinh;

import java.util.Scanner;

public class CHUNGCAKE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean[] dp = new boolean[t + 1];
        dp[0] = true;
        int maxSum = 0;

        for (int num : a) {
            for (int j = t; j >= num; j--) {
                if (dp[j - num]) {
                    dp[j] = true;
                    if (j > maxSum) {
                        maxSum = j;
                    }
                }
            }
        }

        System.out.println(maxSum);
    }
}