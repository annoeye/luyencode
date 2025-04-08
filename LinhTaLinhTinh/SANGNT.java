package LinhTaLinhTinh;

import java.io.*;

public class SANGNT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 2; i <= n; i++) {
            int j;
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) break;
            }
            if (j * j > i) bw.write(i + " ");
        }
        bw.newLine();
        bw.flush();
    }
}