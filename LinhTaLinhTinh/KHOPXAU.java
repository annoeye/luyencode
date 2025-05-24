import java.util.regex.*;
import java.util.*;

public class KHOPXAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        Matcher m = Pattern.compile(Pattern.quote(t)).matcher(s);
        while (m.find())
            System.out.print((m.start() + 1) + " ");
    }
}
