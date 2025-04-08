package LinhTaLinhTinh;

import java.io.*;

public class MAGPERM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]), k = Integer.parseInt(input[1]);

        if (k == 0) {
            for (int i = 1; i <= n; i++) {
                bw.write(i + (i == n ? "\n" : " "));
            }
        } else if (n % (2 * k) != 0) {
            bw.write("-1\n");
        } else {
            for (int i = 1; i <= n; i++) {
                int val = ((i - 1) / k) % 2 == 0 ? i + k : i - k;
                bw.write(val + (i == n ? "\n" : " "));
            }
        }
        bw.flush();
    }
}
