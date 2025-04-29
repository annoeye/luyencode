import java.util.*;

public class SODEP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int l = sc.nextInt(), r = sc.nextInt(), cnt = 0;
            for (int i = l; i <= r; i++) {
                int x = i, rev = 0, sum = 0;
                while (x > 0) {
                    int d = x % 10;
                    rev = rev * 10 + d;
                    sum += d;
                    x /= 10;
                }
                if (rev == i && sum % 10 == 0) cnt++;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
