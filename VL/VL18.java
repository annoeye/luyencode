package VL;

import java.util.Scanner;

public class VL18 {
    public static void main(String[] args) {
        System.out.println(new StringBuilder(new Scanner(System.in).next()).reverse().toString().replaceFirst("^0+", ""));
    }
}
