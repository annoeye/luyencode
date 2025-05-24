import java.util.Scanner;

public class RECT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong() / 2;
        long a = n / 2;
        long b = n - a;
        System.out.println(a * b);
    }
}
