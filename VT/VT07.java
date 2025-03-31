package VT;

import java.util.Scanner;

public class VT07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] a = new int[10]; int i = 0;
            while (i < 10) a[i++] = sc.nextInt();
            int x = sc.nextInt(), found = 0;
            for (i = 0; i < 10; i++)
                if (a[i] == x) {
                    System.out.print((found++ > 0 ? " " : "") + (i + 1));
                }
            if (found == 0) System.out.print("-1");
        }
    }
}
