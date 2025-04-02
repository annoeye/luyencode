import java.util.Scanner;

public class SUM4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            for (long T = sc.nextLong(); T-- > 0;) {
                double n = sc.nextDouble();
                System.out.printf("%.8f%n", (2.0 * n) / (n + 1.0));
            }
        }
    }
}
