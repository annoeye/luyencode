package VL;

import java.util.Scanner;

public class VL09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        sc.close();
        double sum = x, term = x;
        for (int k = 2; k <= n; k++) {
            term *= x / k;
            sum += term;
        }
        System.out.printf("%.2f", sum);
    }
}
