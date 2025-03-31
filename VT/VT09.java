import java.util.Scanner;
import java.util.TreeSet;

public class VT09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), a[] = new int[n];
            TreeSet<Integer> primes = new TreeSet<>();
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                if (a[i] > 1 && (a[i] < 4 || (a[i] % 2 != 0 && a[i] % 3 != 0 && isPrime(a[i]))))
                    primes.add(a[i]);
            for (int x : primes) System.out.print(x + " ");
        }
    }

    static boolean isPrime(int n) {
        for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0) return false;
        return true;
    }
}
