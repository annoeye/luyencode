package XEPSO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class XEPSO1 {
    static final int[] cost = {6,2,5,5,4,5,6,3,7,6};
    static final int INF = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            System.out.println(getSmallest(n) + " " + getLargest(n));
        }
    }

    static String getLargest(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 1) {
            sb.append('7');
            n -= 3;
        }
        sb.append("1".repeat(Math.max(0, n / 2)));
        return sb.toString();
    }

    static String getSmallest(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            if (dp[i] == INF) continue;
            for (int d = 0; d <= 9; d++) {
                int c = cost[d];
                if (i + c <= n) {
                    dp[i + c] = Math.min(dp[i + c], dp[i] + 1);
                }
            }
        }
         StringBuilder sb = new StringBuilder();
        int rem = n;
        int length = dp[n];
        for (int pos = 0; pos < length; pos++) {
            for (int d = (pos == 0 ? 1 : 0); d <= 9; d++) {
                int c = cost[d];
                if (rem - c >= 0 && dp[rem - c] == length - pos - 1) {
                    sb.append((char)('0' + d));
                    rem -= c;
                    break;
                }
            }
        }
        return sb.toString();
    }
}
