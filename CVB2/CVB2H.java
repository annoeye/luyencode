package CVB2;

import java.io.*;
import java.math.BigInteger;

public class CVB2H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            BigInteger x = new BigInteger(br.readLine(), 2);
            sb.append(x.toString(16).toUpperCase()).append('\n');
        }
        System.out.print(sb);
    }
}