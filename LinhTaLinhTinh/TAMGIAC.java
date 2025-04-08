package LinhTaLinhTinh;

import java.io.*;

public class TAMGIAC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]), c = Integer.parseInt(input[2]);

        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2.0;
             bw.write(String.format("%d %.2f\n", (a + b + c),Math.sqrt(p * (p - a) * (p - b) * (p - c))));
        }else bw.write("NO\n");
        
        bw.flush();
        bw.close();
    }
}