package MT;

import java.util.Arrays;
import java.util.Scanner;

public class MT04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) arr[i][j] = sc.nextInt();
            }
            Arrays.sort(arr[a - 1]);
            for (int[] row : arr) {
                for (int element : row) System.out.print(element + "\t");
                System.out.println();
            }
        }
    }
}