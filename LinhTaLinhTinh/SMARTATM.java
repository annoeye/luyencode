import java.util.Scanner;

public class SMARTATM {
    public static int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    for (int i = 1; i <= amount; i++) {
        dp[i] = Integer.MAX_VALUE;
    }
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), amount = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) arr[i] = sc.nextInt();
        System.out.println(coinChange(arr, amount));
    }
}