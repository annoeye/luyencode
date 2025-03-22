import java.util.Scanner;

public class CB07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.format(
                "%.3f "+
                "%.3f",
                2 * 3.14 * r,
                3.14 * Math.pow(r, 2)
        );
        sc.close();
    }
}