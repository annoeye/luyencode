package VL;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VL12 {
    public static void main(String[] args) {
        int n = Math.abs(new Scanner(System.in).nextInt());
        System.out.println(n == 0 ? "INF" :
            IntStream.rangeClosed(1, (int) Math.sqrt(n))
                .filter(i -> n % i == 0)
                .flatMap(i -> i * i == n ? IntStream.of(i) : IntStream.of(n / i, i))
                .boxed().sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining(" "))
        );
    }
}
