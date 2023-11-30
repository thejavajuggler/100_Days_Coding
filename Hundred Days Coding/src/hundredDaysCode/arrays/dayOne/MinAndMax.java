package hundredDaysCode.arrays.dayOne;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n = scanner.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int min = A[0];
        int max = A[0];
        for (int i = 0; i < n; i++) {
            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }
        System.out.println("Min : " + min + " " + "Max : " + max);
    }
}
