package DK;

import java.util.Scanner;

public class DK02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] arr = input.split(" ");
        if (arr.length == 3){
            int numberone = Integer.parseInt(arr[0]);
            int numbertwo = Integer.parseInt(arr[1]);
            int numberthree = Integer.parseInt(arr[2]);
            System.out.println(Math.max(Math.max(numberone, numbertwo), numberthree));
        }
        sc.close();
    }
}