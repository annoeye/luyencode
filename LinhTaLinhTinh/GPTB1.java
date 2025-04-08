package LinhTaLinhTinh;

import java.util.Scanner;

public class GPTB1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] n = new double[6];
            for (int i = 0; i < 6; i++) n[i] = sc.nextDouble();
            double D = n[0] * n[4] - n[1] * n[3];

            System.out.println(D == 0 ?
                (n[0] / n[3] == n[1] / n[4] && n[0] / n[3] == n[2] / n[5] ? "VOSONGHIEM" : "VONGHIEM") :
                String.format("%.2f %.2f", (n[2] * n[4] - n[1] * n[5]) / D, (n[0] * n[5] - n[2] * n[3]) / D)
            );
        }
    }
}
