package SUM;

import java.util.Scanner;

public class SUM2 {
    public static void main(String[] args){
        long n = new Scanner(System.in).nextLong();
        long sum = n * n;
        for (int i = 1; i < n; i++) sum += (long) Math.pow(i, 2);
        System.out.println(sum);
    }
}
