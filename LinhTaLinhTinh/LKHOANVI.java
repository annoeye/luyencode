import java.util.Arrays;
import java.util.Scanner;

public class LKHOANVI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        Arrays.sort(arr);

        do {
            for (int v : arr) System.out.print(v + " ");
            System.out.println();
        } while (nextPerm(arr));
    }

    static boolean nextPerm(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;
        if (i < 0) return false;
        int j = a.length - 1;
        while (a[j] <= a[i]) j--;
        swap(a, i, j);
        for (int l = i + 1, r = a.length - 1; l < r; l++, r--) swap(a, l, r);
        return true;
    }

    static void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
}
 