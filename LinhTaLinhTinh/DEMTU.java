package LinhTaLinhTinh;

import java.util.Scanner;

public class DEMTU {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine().trim();
        System.out.println(str.isEmpty() ? 0 : str.split("\\s+").length);
    }
}
