import java.util.Scanner;

public class DK09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        String result = (year <= 0 || year >= 100000) ? "INVALID" :
                        ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "YES" : "NO";
        System.out.println(result);
    }
}