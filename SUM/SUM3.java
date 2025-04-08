package SUM;

import java.util.Scanner;

public class SUM3 {
    public static void main(String[] args){
        double n = new Scanner(System.in).nextDouble();
        double sum = 0.0;
        for (int i = 1; i <= n; i ++) sum += 1.0 / ((double) i * (i + 1));
        System.out.format("%.5f", sum);
    }
}
