import java.util.*;
import java.io.*;

public class TNV {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Map<Long, Integer> countMap = new HashMap<>();
        for (long num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        long maxHeight = 0;
        for (Map.Entry<Long, Integer> entry : countMap.entrySet()) {
            long currentHeight = entry.getKey();
            int currentCount = entry.getValue();

            if (currentCount > maxCount ||
                (currentCount == maxCount && currentHeight > maxHeight)) {
                maxCount = currentCount;
                maxHeight = currentHeight;
            }
        }

        System.out.println(maxHeight + " " + maxCount);
    }
}