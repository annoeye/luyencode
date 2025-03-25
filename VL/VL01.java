package VL;

import java.util.Scanner;

public class VL01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        for (int i = numberOne; i <= numberTwo; i++) {
            System.out.println(i);
        }
    }
}