package LinhTaLinhTinh;

import java.util.Scanner;

public class DOEXAM { // AI đã làm 🤖
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[T + 1];
        for (int i = 1; i <= T; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        long INF = Long.MIN_VALUE / 2;
        long[][] dp = new long[T + 1][K + 1];
        for (int i = 0; i <= T; i++) {
            for (int j = 0; j <= K; j++) {
                dp[i][j] = INF;
            }
        }

        if (T >= 1) dp[1][1] = a[1];
        if (T >= 2) dp[2][1] = a[2];

        long ans = INF;
        if (K == 1) {
            ans = Math.max(dp[1][1], dp[2][1]);
            System.out.println(ans);
            return;
        }

        for (int j = 2; j <= K; j++) {
            for (int i = j; i <= T; i++) {
                long bestPrev = dp[i - 1][j - 1];
                if (i - 2 >= 1) {
                    bestPrev = Math.max(bestPrev, dp[i - 2][j - 1]);
                }
                if (bestPrev > INF) {
                    dp[i][j] = bestPrev + a[i];
                }
                if (j == K) {
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }

        System.out.println(ans);
    }
}