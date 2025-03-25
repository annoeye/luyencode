package VL;

import java.util.Scanner;

public class VL03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        sc.close();
        System.out.println(((numberOne - 1) * (numberOne + 2)) / 2 + 2 * numberOne);
    }
}