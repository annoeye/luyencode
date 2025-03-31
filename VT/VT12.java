import java.util.*;

public class VT12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); List<Integer> numbers = new ArrayList<>();
            while (n-- > 0) numbers.add(sc.nextInt());
            numbers.sort(Collections.reverseOrder());
            System.out.println(numbers.getFirst() - numbers.getLast());
        }
    }
}
