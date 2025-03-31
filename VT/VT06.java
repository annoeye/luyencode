package VT;

import java.util.Scanner;

public class VT06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), count = 0; double sum = 0;
            for (int i = 0, x; i < n; i++) if ((x = sc.nextInt()) % 2 != 0) { sum += x; count++; }
            System.out.printf("%.4f", count == 0 ? 0 : sum / count);
        }
    }
}
