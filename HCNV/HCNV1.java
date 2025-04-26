package HCNV;

import java.util.Scanner;

public class HCNV1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        int left = Math.min(x1, x2);
        int right = Math.max(x1, x2);
        int bottom = Math.min(y1, y2);
        int top = Math.max(y1, y2);
        System.out.println((x3 > left && x3 < right && y3 > bottom && y3 < top) ? "YES" : "NO");
    }
}