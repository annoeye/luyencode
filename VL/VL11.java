package VL;

import java.util.Scanner;

public class VL11 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n > 1 && (n < 4 || (n % 2 != 0 && n % 3 != 0 && isPrime(n))) ? "YES" : "NO");
    }

    static boolean isPrime(int n) {
        for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0) return false;
        return true;
    }
}
