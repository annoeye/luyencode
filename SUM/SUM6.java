package SUM;

import java.util.Scanner;

public class SUM6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int n = sc.nextInt();
                double sn = 0.0;
                if (n > 0) {
                    sn = Math.sqrt(2.0);
                    for (int i = 2; i <= n; i++) {
                        sn = Math.sqrt(2.0 + sn);
                    }
                }
                System.out.format("%.5f\n", sn);
            }
        }
    }
}