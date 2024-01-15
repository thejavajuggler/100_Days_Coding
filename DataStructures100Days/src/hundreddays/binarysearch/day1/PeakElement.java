package hundreddays.binarysearch.day1;

public class PeakElement {
    /**
     * Given an array of integers A, find and return the peak element in it.
     * An array element is considered a peak if it is not smaller than its neighbors. For corner elements, we need to consider only one neighbor.
     *
     * NOTE: Array is going to be in increasing and decreasing order
     *
     * It is guaranteed that the array contains only a single peak element.
     * Users are expected to solve this in O(log(N)) time. The array may contain duplicate elements
     * @param args
     */
    public static void main(String[] args) {
        //A = [1, 2, 3, 4, 5] ans = 5
        //A = [5, 17, 100, 11] ans = 100
        int[] A = {5, 17, 100, 11};
        System.out.println(findPeakElement(A));

    }



    private static int findPeakElement(int[] A) {
        int N = A.length;
        if (N == 1)
            return A[0];
        if (A[0] > A[1])
            return A[0];
        if (A[N - 1] > A[N - 2])
            return A[N - 1];
        int l = 0, r = N - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[mid - 1] <= A[mid] && A[mid + 1] <= A[mid])
                return A[mid];
            else if (A[mid + 1] >= A[mid] && A[mid - 1] <= A[mid]) {
                l = mid + 1;
            }
            else
                r = mid - 1;
        }
        return -1;
    }
}
