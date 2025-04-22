package STR;

import java.util.*;
import java.util.stream.Collectors;

public class STR02 {
    public static void main(String[] args) {
        new Scanner(System.in).tokens()
            .skip(1)
            .map(s -> Arrays.stream(s.split(" "))
                  .map(w -> w.isEmpty() ? w : w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase())
                  .collect(Collectors.joining(" ")))
            .forEach(System.out::println);
    }
}