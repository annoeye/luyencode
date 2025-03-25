package VL;

import java.util.Scanner;

public class VL17 {
    public static void main(String[] args) {
        int n = Math.abs(new Scanner(System.in).nextInt());
        System.out.println(java.util.stream.IntStream.rangeClosed(1, (int) Math.sqrt(n))
                .filter(i -> n % i == 0)
                .map(i -> (i * i == n) ? 1 : 2) 
                .sum());
    }
}
