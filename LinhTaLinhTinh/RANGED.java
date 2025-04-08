package LinhTaLinhTinh;

import java.io.*;

public class RANGED {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]),
        b = Long.parseLong(input[1]),
        c = Long.parseLong(input[2]),
        d = Long.parseLong(input[3]);
        if (Math.max(a, c) <= Math.min(b, d)) bw.write("YES\n");
        else bw.write("NO\n");
        bw.close();
        br.close();
    }
}