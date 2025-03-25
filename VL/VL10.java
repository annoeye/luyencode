package VL;

import java.util.Scanner;

public class VL10 {
    public static void main(String[] args) {
        String n = new Scanner(System.in).nextLine().replaceAll("\\s+", ""); 
        System.out.println(n.length() - (n.startsWith("-") ? 1 : 0));
    }
}
