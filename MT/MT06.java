package MT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MT06 {
    public static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) arr[i][j] = sc.nextInt();
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if (isPerfectSquare(arr[i][j]) && !newArr.contains(arr[i][j]))
                    newArr.add(arr[i][j]);
        }
        if (newArr.isEmpty()) System.out.println("NOT FOUND");
        else {
            Collections.sort(newArr);
            System.out.println(
                    String.join(" ",newArr.stream()
                                        .map(String::valueOf)
                                        .toArray(String[]::new)));
        }
    }
}