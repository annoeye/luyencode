package STR;

import java.util.*;

public class STR04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        Map<Character, Integer> freqMap = new TreeMap<>();

        input.chars()
            .filter(c -> (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z'))
            .forEach(c -> freqMap.merge((char)c, 1, Integer::sum));

        freqMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}