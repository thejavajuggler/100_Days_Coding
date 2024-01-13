package hundreddays.binarysearch;

import java.util.Arrays;

/**
 * Given a sorted array of integers A (0-indexed) of size N, find the left most and the right most index of a given integer B in the array A.
 *
 * Return an array of size 2, such that
 *           First element = Left most index of B in A
 *           Second element = Right most index of B in A.
 * If B is not found in A, return [-1, -1].
 *
 * Note : Your algorithm's runtime complexity must be in the order of O(log n).
 * Example Input
 * Input 1:
 *
 *  A = [5, 7, 7, 8, 8, 10]
 *  B = 8
 * Input 2:
 *
 *  A = [5, 17, 100, 111]
 *  B = 3
 *
 *
 * Example Output
 * Output 1:
 *
 *  [3, 4]
 * Output 2:
 *
 *  [-1, -1]
 */
public class RangeOfRepeatedElements {

    public static void main(String[] args) {
        int[] A = {5, 7, 7, 8, 8, 10};
        int B = 8;
        System.out.println("Elements in range");
        int leftRangeOfRepeatedElements = findRangeOfRepeatedElements(A, B, 1);
        int rightRangeOfRepeatedElements = findRangeOfRepeatedElements(A, B, 2);
        System.out.println(leftRangeOfRepeatedElements + " " + rightRangeOfRepeatedElements);
        int[] C = {leftRangeOfRepeatedElements, rightRangeOfRepeatedElements};
        System.out.println(Arrays.toString(C));
    }

    private static int findRangeOfRepeatedElements(int[] A, int B, int side) {
        int ans = -1;
        int N = A.length;
        int l = 0, r = N - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[mid] == B) {
                ans = mid;
                if (side == 1)
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            else if (A[mid] > B)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return ans;
    }

}
