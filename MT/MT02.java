package MT;

import java.util.Scanner;

public class MT02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] a = new int[m][n];
        int sum = 0;
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
        for (int i = 0; i < m; i++) if (i % 2 != 0) for (int j = 0; j < n; j++) sum += a[i][j];
        System.out.println(sum);
        sc.close();
    }
}