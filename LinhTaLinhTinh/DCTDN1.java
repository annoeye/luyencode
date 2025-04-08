package LinhTaLinhTinh;

import java.util.Scanner;

public class DCTDN1 {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt(); int[] arr = new int[n];
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                int[] oup = new int[n]; oup[0] = 1; int max = 1;
                for (int i = 1; i < n; i++){
                    oup[i] = 1;
                    for (int j = 0; j < i; j++) if(arr[i] > arr[j]) oup[i] = Math.max(oup[i], oup[j] + 1);
                    max = Math.max(max, oup[i]);
                }
                System.out.println(max);
            }
        }
    }