package SUM;

import java.util.Scanner;

public class SUBSUM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        System.out.format("%d\n%d", (a+b)/2, (a-b)/2);
    }
}