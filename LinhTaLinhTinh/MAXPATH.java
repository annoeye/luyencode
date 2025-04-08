import java.util.Scanner;

public class MAXPATH {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt(), n = sc.nextInt();
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++){ for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt(); }
            long[][] dp = new long[m][n];
            for(int i = 0; i < m; i++) dp[i][0] = arr[i][0];
            for(int j = 1; j < n; j++) {
                for(int i = 0; i < m; i++) {
                    dp[i][j] = Long.MIN_VALUE;
                    dp[i][j] = Math.max(dp[i][j], dp[i][j-1]);
                    if(i > 0) dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]);
                    if(i < m-1) dp[i][j] = Math.max(dp[i][j], dp[i+1][j-1]);
                    dp[i][j] += arr[i][j];
                }
            }
            long result = Long.MIN_VALUE;
            for(int i = 0; i < m; i++) result = Math.max(result, dp[i][n-1]);
            System.out.println(result);
        }
    }
}