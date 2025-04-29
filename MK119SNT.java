import java.util.*;
public class MK119SNT {
    public static void main(String[] a) {
        int N = 1_000_000;
        boolean[] P = new boolean[N+1];
        Arrays.fill(P, true); P[0]=P[1]=false;
        for (int i = 2; i*i <= N; i++)
            if (P[i]) for (int j = i*i; j <= N; j += i) P[j] = false;
        int[] S = new int[N+1];
        for (int i = 1; i <= N; i++) S[i] = S[i-1] + (P[i]?1:0);

        Scanner in = new Scanner(System.in);
        for (int T = in.nextInt(); T-- > 0; ) {
            int L = in.nextInt(), R = in.nextInt();
            System.out.println(S[R] - S[L-1]);
        }
    }
}
