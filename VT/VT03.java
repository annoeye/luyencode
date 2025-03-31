package VT;

import java.util.Scanner;

public class VT03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), maxIdx = 0;
            long max = sc.nextLong();
            for (int i = 1, x; i < n; i++)
                if ((x = sc.nextInt()) >= max) { max = x; maxIdx = i; }
            System.out.println(maxIdx);
        }
    }
}
