import java.util.Scanner;

public class NEXTCHAR {
    public static void main(String[] args) {
        char c = new Scanner(System.in).next().charAt(0);
        if (c == 'z')
            System.out.println('a');
        else
            System.out.println((char) (c + 1));
    }
}
