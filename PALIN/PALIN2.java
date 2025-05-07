package PALIN;

import java.util.Scanner;

public class PALIN2 {

    public static boolean isPalindromic(long num) {
        String s = String.valueOf(num);
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static long countPalindromicNumbers(long l, long r) {
        long count = 0;
        for (long num = l; num <= r; num++) {
            if (isPalindromic(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) System.out.println(countPalindromicNumbers(sc.nextLong(), sc.nextLong()));
        sc.close();
    }
}