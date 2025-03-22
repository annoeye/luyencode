import java.util.Scanner;

public class DK06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numberone = sc.nextFloat();
        float numbertwo = sc.nextFloat();
        sc.close();
        String result = (numberone == 0 && numbertwo == 0) ? "WOW" :
                        (numberone == 0) ? "NO" :
                        String.format("%.2f", -numbertwo / numberone);
        System.out.println(result);
    }
}