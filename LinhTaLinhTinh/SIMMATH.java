package LinhTaLinhTinh;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SIMMATH {
    static final long MOD = 998244353;
    static final long INV2 = 499122177;
    static long sumTo(long n){
        n %= MOD;
        return n * (n + 1) % MOD * INV2 % MOD;
    }
    static long result(long a, long b, long c){
        a = sumTo(a); b = sumTo(b); c = sumTo(c);
        return ((((a * b) % MOD) * c) % MOD);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            System.out.println(
                result(Long.parseLong(st.nextToken()),
                       Long.parseLong(st.nextToken()),
                       Long.parseLong(st.nextToken())
                ));
        }
    }
}