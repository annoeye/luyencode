package DK;

import java.util.Scanner;

public class DK10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        sc.close();
        String result = (month < 1 || month > 12 || year <= 0) ? "INVALID" :
                        (month == 2) ? ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? "29" : "28") :
                        (switch (month) {
                            case 4, 6, 9, 11 -> "30";
                            default -> "31";
                        });
        System.out.println(result);
    }
}
