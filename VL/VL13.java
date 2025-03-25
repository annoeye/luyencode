package VL;

import java.util.Scanner;
import java.util.stream.IntStream;

public class VL13 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n > 1 && IntStream.range(1, n).filter(i -> n % i == 0).sum() == n ? "YES" : "NO");
    }
}