package GT;

import java.math.BigInteger;
import java.util.Scanner;

public class GT2 {
    static BigInteger GT(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- >0){
            System.out.println(GT(sc.nextInt()));
        }
    }
}