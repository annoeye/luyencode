package VT;

import java.util.Arrays;
import java.util.Scanner;

public class VT01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        System.out.println(Arrays.stream(a).max().orElse(-1));
    }
}
