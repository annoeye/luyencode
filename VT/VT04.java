package VT;

import java.util.Scanner;

public class VT04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), x = sc.nextInt();
            while (n-- > 0) if (sc.nextInt() == x) { System.out.println("YES"); return; }
            System.out.println("NO");
        }
    }
}
