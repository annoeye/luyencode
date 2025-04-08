package LinhTaLinhTinh;

import java.util.Scanner;

public class DUYNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String n = sc.next();
            System.out.println(n.charAt(0) == n.charAt(n.length() - 1) ? "YES" : "NO");
        }
    }
}
