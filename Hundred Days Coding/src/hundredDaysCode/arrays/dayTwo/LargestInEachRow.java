package hundredDaysCode.arrays.dayTwo;

import java.util.Arrays;

public class LargestInEachRow {
    public static void main(String[] args) {
        int[][] A = {{1, 4, 3}, {4, 9, 6}, {7, 8, 9}};
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int max = A[i][0];
            for (int j = 0; j < A[0].length; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
            B[i] = max;
        }
        System.out.println(Arrays.toString(B));
    }
}
