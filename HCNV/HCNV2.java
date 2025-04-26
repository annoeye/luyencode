package HCNV;
import java.util.Scanner;

public class HCNV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x1 = sc.nextLong(), y1 = sc.nextLong();
        long x2 = sc.nextLong(), y2 = sc.nextLong();

        long x3 = sc.nextLong(), y3 = sc.nextLong();
        long x4 = sc.nextLong(), y4 = sc.nextLong();

        long left1 = Math.min(x1, x2);
        long right1 = Math.max(x1, x2);
        long bottom1 = Math.min(y1, y2);
        long top1 = Math.max(y1, y2);

        long left2 = Math.min(x3, x4);
        long right2 = Math.max(x3, x4);
        long bottom2 = Math.min(y3, y4);
        long top2 = Math.max(y3, y4);

        long left = Math.max(left1, left2);
        long right = Math.min(right1, right2);
        long bottom = Math.max(bottom1, bottom2);
        long top = Math.min(top1, top2);

        if (left >= right || bottom >= top) {
            System.out.println(0);
        } else {
            long area = (right - left) * (top - bottom);
            System.out.println(area);
        }
    }
}