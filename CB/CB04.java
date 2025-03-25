package CB;

import java.util.Scanner;

public class CB04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] arr = input.split(" ");
        if (arr.length == 2){
            int numberone = Integer.parseInt(arr[0]);
            int numbertwo = Integer.parseInt(arr[1]);
            int multiplication = (numberone == 0 || numbertwo == 0) ? 0 : numberone * numbertwo;
            String division = (numbertwo == 0) ? "ERROR" : String.format("%.2f%n", (double) numberone / numbertwo);
            System.out.format(
                    "%d%n"+
                    "%d%n"+
                    "%d%n"+
                    "%s%n",
                    numberone + numbertwo,
                    numberone - numbertwo,
                    multiplication,
                    division
            );
        }
        sc.close();
    }
}