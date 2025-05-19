package Luyencode.CVB2;

import java.math.BigInteger;
import java.util.Scanner;

public class HEX2BIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < T; i++) {
            String hex = sc.nextLine().trim();
            BigInteger decimal = new BigInteger(hex, 16);
            System.out.println(decimal.toString(2));
        }
    }
}