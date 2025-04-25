package SUM;

import java.io.*;

public class INVSUM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        double[] dp = new double[1_000_001];
        dp[0] = 0;
        for (int i = 1; i <= 1_000_000; i++) {
            dp[i] = dp[i - 1] + 1.0 / (2 * i -1);
        }

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            pw.printf("%.5f\n", dp[n]);
        }

        pw.flush();
    }
}