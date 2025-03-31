import java.util.Scanner;

public class GT01 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(fact(n));
    }

    static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }
}
