package PR;

import java.util.Scanner;

public class PROD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 || b == 0)
            System.out.println(0);
        else if (a * b > 0)
            System.out.println(1);
        else
            System.out.println(-1);

    }
}
