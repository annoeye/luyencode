import java.util.Scanner;

public class THETICH {
    public static void main(String[] args){
        int n = new Scanner(System.in).nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println(sum * sum);
    }
}