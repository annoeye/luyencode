import java.util.Scanner;

public class CB06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] arr = input.split(" ");
        if (arr.length == 2){
            int numberone = Integer.parseInt(arr[0]);
            int numbertwo = Integer.parseInt(arr[1]);
            System.out.format(
                    "%d%n"+
                    "%d%n",
                    (numberone + numbertwo) * 2,
                    numberone * numbertwo
                    );
        }
        sc.close();
    }
}