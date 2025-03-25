package VL;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class VL05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberone = sc.nextInt();
        sc.close();
        AtomicInteger S = new AtomicInteger(3 * numberone + 1);
        Supplier<Integer> sumCalculator = () -> {
            int tempSum = 0;
            for (int i = 1; i < S.get(); i++) {
                tempSum = (i % 2 == 0) ? tempSum - i : tempSum + i;
            }
            return (numberone % 2 == 0) ? tempSum + S.get() : tempSum - S.get();
        };
        System.out.println(sumCalculator.get());
    }
}
