package MT;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MT05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), col = sc.nextInt()-1;
        final int finalCol = Math.max(0, Math.min(col, m-1)); 

        int[][] matrix = new int[n][m];
        IntStream.range(0, n).forEach(i ->
            IntStream.range(0, m).forEach(j -> matrix[i][j] = sc.nextInt()));

        int[] sortedCol = Arrays.stream(matrix)
                               .mapToInt(row -> row[finalCol])
                               .sorted()
                               .toArray();

        IntStream.range(0, n).forEach(i -> matrix[i][finalCol] = sortedCol[i]);

        Arrays.stream(matrix).forEach(row -> {
            Arrays.stream(row).forEach(num -> System.out.print(num + " "));
            System.out.println();
        });
    }
}