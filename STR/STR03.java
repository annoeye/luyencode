package STR;

import java.util.Scanner;

public class STR03 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine().toLowerCase();
            int T = Integer.parseInt(sc.nextLine());
            while (T-- > 0) {
                char c = sc.nextLine().toLowerCase().charAt(0);
                System.out.println(str.chars().filter(ch -> ch == c).count());
            }
        }
    }
}