package SCBN;

import java.util.*;

public class SCBN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        long count = 0;
        for (int frequency : freqMap.values()) {
            if (frequency >= 2) {
                count += (long) frequency * (frequency - 1) / 2;
            }
        }

        System.out.println(count);
    }
}
