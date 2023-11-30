package hundredDaysCode.arrays.dayTwo;

import java.util.Arrays;

public class ColumnSum {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(returnColumnSum(A)));
    }

    private static int[] returnColumnSum(int[][] A) {
        int[] B = new int[A[0].length];
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                B[i] = B[i] + A[j][i];
            }

        }
        return B;
    }
}
