package PALIN;

import java.util.Scanner;

public class PALIN1 {
    public static long countPalindromes(int n) {
        long halfSize = (long) Math.pow(10, (n - 1) / 2);
        return 9 * halfSize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) System.out.println(countPalindromes(sc.nextInt()));
    }
}