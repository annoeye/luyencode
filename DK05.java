import java.util.Scanner;

public class DK05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        sc.close();
        System.out.println((int)Math.sqrt(input) * Math.sqrt(input) == input ? "YES" : "NO");
    }
}