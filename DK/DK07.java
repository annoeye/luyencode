package DK;

import java.util.Scanner;

public class DK07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numberone = sc.nextFloat();
        float numbertwo = sc.nextFloat();
        float numberthree = sc.nextFloat();
        sc.close();
        float delta = numbertwo * numbertwo - 4 * numberone * numberthree;
        String result = (numberone == 0 && numbertwo == 0) ? (numberthree == 0 ? "WOW" : "NO") :
                        (numberone == 0) ? String.format("%.2f", -numberthree / numbertwo) :
                        (delta < 0) ? "NO" :
                        (delta == 0) ? String.format("%.2f", -numbertwo / (2 * numberone)) :
                        String.format("%.2f %.2f",
                                     (-numbertwo - Math.sqrt(delta)) / (2 * numberone),
                                     (-numbertwo + Math.sqrt(delta)) / (2 * numberone));
        System.out.println(result);
    }
}
