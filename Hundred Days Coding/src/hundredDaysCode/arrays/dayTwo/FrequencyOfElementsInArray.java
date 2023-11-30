package hundredDaysCode.arrays.dayTwo;

import java.util.Arrays;

public class FrequencyOfElementsInArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 1, 2};
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j])
                    count++;
            }
            B[i] = count;
        }
        System.out.println(Arrays.toString(B));
    }
}
