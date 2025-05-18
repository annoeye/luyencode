package LinhTaLinhTinh;

import java.util.Scanner;

public class SCBN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), cout = 0;
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length - 1; i++) if (arr[i] == arr[i + 1]) cout++;
        System.out.println(cout);
    }
}