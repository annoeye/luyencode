import java.util.Scanner;

public class DATE1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int y = scanner.nextInt();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        int month = 0;
        while (n > daysInMonth[month]) {
            n -= daysInMonth[month];
            month++;
        }

        System.out.println(n + " " + (month + 1));
    }
}