package VL;

import java.util.Scanner;

public class VL08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberone = sc.nextInt();
        int numbertwo = sc.nextInt();
        sc.close();
        numberone = (numberone % 2 == 0) ? numberone : numberone + 1;
        numbertwo = (numbertwo % 2 == 0) ? numbertwo : numbertwo - 1;
        System.out.println((long) ((numbertwo - numberone) / 2 + 1) * (numberone + numbertwo) / 2);
    }
}