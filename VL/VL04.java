package VL;

import java.util.Scanner;

public class VL04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        sc.close();
        float sun = 0;
        for (int i = 2; i <= numberOne; i++) {
            sun += (float) (1.0 / i);
        }
        System.out.format("%.4f", sun);
    }
}