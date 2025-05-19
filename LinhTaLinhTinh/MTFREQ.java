package Luyencode.LinhTaLinhTinh;

import java.util.*;

public class MTFREQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashMap<Long, Integer> frequencyMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(frequencyMap.size());
        for (Map.Entry<Long, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}