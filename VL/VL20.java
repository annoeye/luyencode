package VL;

import java.util.Scanner;

public class VL20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        for (char i = a; i <= b; i++) {
            System.out.println(Character.toUpperCase(i) + " ");
        }
    }
}