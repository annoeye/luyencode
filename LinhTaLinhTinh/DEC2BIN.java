import java.util.Scanner;

public class DEC2BIN  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            sb.append(Long.toBinaryString(sc.nextLong())).append("\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
