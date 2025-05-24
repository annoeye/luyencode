package PR;

import java.util.Scanner;

public class PRER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {
                sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()
        };
        int a = (arr[0] == 0) ? 0 : arr[0] * arr[2];
        int b = (arr[1] == 0) ? 0 : arr[1] * arr[3];
        System.out.println(a + b);
    }

}
