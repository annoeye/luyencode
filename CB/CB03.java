package CB;

import java.util.Scanner;

public class CB03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] arr = input.split(" ");
        if (arr.length == 3){
            int numberone = Integer.parseInt(arr[0]);
            int numbertwo = Integer.parseInt(arr[1]);
            int numberthree = Integer.parseInt(arr[2]);
            System.out.println(numberone + numbertwo + numberthree);
        }
        sc.close();
    }
}