import java.util.Scanner;

public class MANG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) arr[i] = sc.nextInt();
        long sum = 0, eveSum = 0, location = 0;
        for (int i = 0; i < T; i++) {
            sum += arr[i];
            if (arr[i] % 2 == 0) eveSum++;
            if (arr[i] > 0) location = arr[i];
        }
        System.out.format("%d %d %d", sum, eveSum, location);
    }
}