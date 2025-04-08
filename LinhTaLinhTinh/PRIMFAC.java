import java.util.*;

public class PRIMFAC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.nextLine());
        Map<Long, Integer> factors = new TreeMap<>();
        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n > 1)  factors.put(n, 1);
        System.out.println(factors.size());
        for (Map.Entry<Long, Integer> entry : factors.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
