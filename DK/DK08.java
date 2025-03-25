package DK;

import java.util.Scanner;

public class DK08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberone = sc.nextDouble();
        String operators = sc.next();
        double numbertwo = sc.nextDouble();
        sc.close();
        String result = (operators.equals("+")) ? String.format("%.2f", numberone + numbertwo ) :
                        (operators.equals("-")) ? String.format("%.2f", numberone - numbertwo ) :
                        (operators.equals("*")) ? String.format("%.2f", numberone * numbertwo ) :
                        (operators.equals("/") && numbertwo != 0) ? String.format("%.2f",   numberone / numbertwo ) :
                        "Math Error";
        System.out.println(result);
    }
}
