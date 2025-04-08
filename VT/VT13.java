package VT;

import java.util.*;

public class VT13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> numbers = new ArrayList<>();
            for (int n = sc.nextInt(); n-- > 0; numbers.add(sc.nextInt()));
            int num1 = numbers.get(0), num2 = numbers.get(1), maxSum = num1 + num2;
            for (int i = 1; i < numbers.size(); i++) {
                int sum = numbers.get(i) + numbers.get((i + 1) % numbers.size());
                if (sum > maxSum) {
                    maxSum = sum;
                    num1 = numbers.get(i);
                    num2 = numbers.get((i + 1) % numbers.size());
                }
            }
            System.out.println(num1 + " " + num2);
        }
    }
}
