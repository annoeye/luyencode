package Luyencode.LinhTaLinhTinh;

import java.util.Scanner;

public class MINMAX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); int[] arr = new int[T];
        for (int i = 0; i < T; i++) arr[i] = sc.nextInt();
        int max = arr[0], min = arr[0];
        int lowesElementPosition = 0, largesElementPosition = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                lowesElementPosition = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                largesElementPosition = i;
            }
        }
        System.out.format("%d %d %d %d", min, lowesElementPosition + 1, max, largesElementPosition + 1);
    }
}