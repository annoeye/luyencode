package VL;

import java.util.Scanner;

public class VL15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        if (b == 0) {
                System.out.println("INVALID");
                return;
        }
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;
        System.out.println(b < 0 ? (-a) + " " + (-b) : (b == 1 ? a : a + " " + b));
    }
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}