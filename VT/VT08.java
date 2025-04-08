package VT;

import java.util.Scanner;

public class VT08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 1; i < n; i += 2) a[i] += Math.abs((i + 1 < n ? a[i + 1] : 0) - (i > 0 ? a[i - 1] : 0));
            for (int x : a) System.out.print(x + " ");
        }
    }
}
