package LinhTaLinhTinh;

import java.util.HashSet;
import java.util.Scanner;

public class NEWYEAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        HashSet<String> uniqueGreetings = new HashSet<>();
        for (int i = 0; i < T; ++i) uniqueGreetings.add(sc.nextLine());
        System.out.println(uniqueGreetings.size());
    }
}