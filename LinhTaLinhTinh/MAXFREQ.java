package LinhTaLinhTinh;

import java.util.*;

public class MAXFREQ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; ++i) arr[i] = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Collections.max(map.values());
        int result = -1;
        for (int num : arr) {
            if (map.get(num) == maxFreq) {
                result = num;
                break;
            }
        }
        System.out.println(result + " " + maxFreq);
    }
}