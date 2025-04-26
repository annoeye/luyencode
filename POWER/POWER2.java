package POWER;

import java.math.BigInteger;
import java.util.*;

public class POWER2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger base = BigInteger.valueOf(sc.nextLong());
        BigInteger result = base.pow((int) sc.nextLong());
        System.out.println(result);
    }
}