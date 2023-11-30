package hundredDaysCode.arrays.dayTwo;

import java.util.Arrays;

public class RowSum {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(returnRowSum(A)));
    }

    private static int[] returnRowSum(int[][] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                B[i] = B[i] + A[i][j];
            }

        }
        return B;
    }
}
