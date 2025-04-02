import java.util.Scanner;

public class DT1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double S = 0.5 * Math.PI * Math.pow(sc.nextDouble(), 2);
            System.out.printf("%.3f%n", S);
        }
    }
}
