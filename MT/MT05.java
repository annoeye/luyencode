package MT;

import java.util.*;

public class MT05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), col = sc.nextInt() - 1;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) arr[i][j] = sc.nextInt();
        }
        int[] colValues = new int[n];
        for (int i = 0; i < n; i++) colValues[i] = arr[i][col];
        Arrays.sort(colValues);
        for (int i = 0; i < n; i++) arr[i][col] = colValues[i];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.println(arr[i][j]);
            System.out.println();
        }
    }
}

/*
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
 */