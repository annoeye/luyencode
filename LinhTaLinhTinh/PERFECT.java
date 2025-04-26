package LinhTaLinhTinh;

import java.util.Arrays;
import java.util.Scanner;

public class PERFECT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) arr[i] = sc.nextInt();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < T - 1; i++) {
            min = Math.min(min, Math.abs(arr[i + 1] - arr[i]));
        }
        System.out.println(min);

    }
}