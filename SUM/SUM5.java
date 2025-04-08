package SUM;

import java.io.*;

public class SUM5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()), max = 1;
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) { arr[i] = Integer.parseInt(br.readLine()); max = Math.max(arr[i], max); }
        double[] sum = new double[max + 1]; sum[1] = 1.0;
        for (int i = 2; i <=max; i++) sum[i] = sum[i - 1] + 1.0 /i;
        for (int n : arr) bw.write(String.format("%.5f\n", sum[n]));
        bw.flush();
    }
}