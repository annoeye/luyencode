import java.math.BigInteger;
import java.util.Scanner;

public class SUMBIG {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(sc.nextBigInteger().add(sc.nextBigInteger()));
        }
    }
}
