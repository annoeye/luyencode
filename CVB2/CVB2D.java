package CVB2;

import java.math.BigInteger;
import java.util.Scanner;

public class CVB2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) System.out.println(new BigInteger(sc.nextLine(), 2));
    }
}