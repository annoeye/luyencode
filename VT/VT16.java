package VT;

import java.util.*;

public class VT16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean found = false;
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num < 0) {
                    System.out.print((found ? " " : "") + num);
                    found = true;
                }
            }
            if (!found) System.out.print("NOT FOUND");
        }
    }
}
