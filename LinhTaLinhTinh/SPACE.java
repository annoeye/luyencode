package LinhTaLinhTinh;

import java.util.*;

public class SPACE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int[] results = new int[T];
        for (int i = 0; i < T; i++) {
            String line = sc.nextLine().replaceAll("\\s+", " ");
            results[i] = (int) line.chars().filter(c -> c == ' ').count();
        }
        for (int res : results) {
            System.out.println(res);
        }
    }
}
