import java.util.Scanner;

public class DSCP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(demSoChinhPhuong(sc.nextLong(), sc.nextLong()));
    }
    static long demSoChinhPhuong(long a, long b) {
        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }
        long start = (long) Math.ceil(Math.sqrt(a));
        long end = (long) Math.floor(Math.sqrt(b));
        return Math.max(0, end - start + 1);
    }
}