package VL;

import java.util.Scanner;
import java.util.function.Supplier;

public class VL07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        sc.close();
            Supplier<Long> combinationCalculator = () -> {
                long result = 1;
                for (int i = 0; i < Math.min(k, n - k); i++)
                    result = result * (n - i) / (i + 1);
                return result;
            };
        System.out.println(combinationCalculator.get());
    }
}
