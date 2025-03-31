package VT;

import java.util.Scanner;

public class VT05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), x = sc.nextInt(); int count = 0;
            while (n-- > 0) if (sc.nextInt() == x) count ++;
            System.out.println(count);
        }
    }
}
