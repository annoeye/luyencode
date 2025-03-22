import java.util.Scanner;

public class DK04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        sc.close();
        int roundedValue = (int) Math.round(Math.abs(input));
        System.out.println(input > 0 ? roundedValue : -roundedValue);
    }
}