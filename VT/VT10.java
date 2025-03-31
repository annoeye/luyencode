import java.util.*;

public class VT10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); List<Integer> numbers = new ArrayList<>();
            while (n-- > 0) numbers.add(sc.nextInt());
            numbers.sort(Collections.reverseOrder());
            for (int num : numbers) System.out.print(num + " ");
        }
    }
}
