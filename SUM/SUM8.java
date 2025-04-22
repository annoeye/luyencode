package SUM;

import java.util.*;
import java.text.DecimalFormat;
import java.io.IOException;

public class SUM8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("#.00000");
        List<String> results = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            double currentValue = (double) n;
            for (int j = n - 1; j >= 1; j--) {
                currentValue = Math.sqrt(j + currentValue);
            }
            results.add(df.format(currentValue));
        }

        for (String result : results) {
            System.out.println(result);
        }
        scanner.close();
    }
}