import java.util.*;

public class VT15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); List<Integer> numbers = new ArrayList<>();
            while (n-- > 0) numbers.add(sc.nextInt());
            Collections.sort(numbers);
            System.out.println(Math.max(numbers.getFirst() * numbers.get(1) * numbers.getLast(), numbers.get(numbers.size() - 3) * numbers.get(numbers.size() - 2) * numbers.getLast()));
        }
    }
}
