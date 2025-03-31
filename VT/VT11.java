import java.util.Scanner;
import java.util.Arrays;

public class VT11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a, 1, n - 1);
            for (int num : a) System.out.print(num + " ");
        }
    }
}
