package hundredDaysCode.arrays.dayOne;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The number of elements in the array :");
        int n = scanner.nextInt();
        int[] A = new int[n + 1];
        System.out.println("Enter the elements one by one :");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to be inserted :");
        int k = scanner.nextInt();
        System.out.println("Enter the position to be inserted : ");
        int x = scanner.nextInt();
        if (x > n) {
            System.out.println("Please enter the position below the array size");
        }
        for (int i = n - 1; i >= x; i--) {
            A[i + 1] = A[i];
        }
        A[x] = k;

        System.out.println(Arrays.toString(A));
    }
}
