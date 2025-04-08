package VT;

import java.util.Arrays;
import java.util.Scanner;

public class VT02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        int[] top2 = Arrays.stream(a)
                .distinct()
                .sorted()
                .toArray();
        System.out.println(top2.length >= 2 ? top2[top2.length - 2] : "NOT FOUND");
    }
}
