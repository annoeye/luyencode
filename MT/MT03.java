package MT;

import java.util.Scanner;

public class MT03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; sum += arr[i][i], i++);
            System.out.println(sum);
        }
    }
}