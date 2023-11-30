package hundredDaysCode.arrays.dayOne;

import java.util.Arrays;

public class ReverseElements {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9};
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(A));
    }
}
