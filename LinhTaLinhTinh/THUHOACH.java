import java.util.Scanner;

public class THUHOACH {
    public static void main(String[] args){
      try (Scanner sc = new Scanner(System.in)) {
          int n = sc.nextInt(), t = sc.nextInt(), a[] = new int[n];
          for (int i = 0; i < n; a[i++] = sc.nextInt());
          go(a, 0, 0, t);
          System.out.println(max);
      }
    }
    static int max = 0;
    static void go(int[] a, int i, int sum, int t) {
        if (sum > t) return;
        max = Math.max(max, sum);
        if (i == a.length) return;
        go(a, i+1, sum + a[i], t);
        go(a, i+1, sum, t);
    }
}