import java.util.Scanner;

public class VL21 {
    public static void main(String[] args) {
        long N = new Scanner(System.in).nextLong();
        long x = (long) ((Math.sqrt(1 + 8L * N) - 1) / 2);
        System.out.println(x);
    }
}