package hundreddays.binarysearch.day1;

/**
 * Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once.
 *
 * Elements which are appearing twice are adjacent to each other.
 *
 * NOTE: Users are expected to solve this in O(log(N)) time.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *
 * 1 <= A[i] <= 10^9
 *
 *
 *
 * Input Format
 * The only argument given is the integer array A.
 *
 *
 *
 * Output Format
 * Return the single element that appears only once.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 1, 7]
 * Input 2:
 *
 * A = [2, 3, 3]
 *
 *
 * Example Output
 * Output 1:
 *
 *  7
 * Output 2:
 *
 *  2
 */
public class UniqueElementInSortedArray {

    public static void main(String[] args) {

        int[] A = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        System.out.println(findTheUniqueElement(A));
    }

    private static int findTheUniqueElement(int[] A) {
        int N = A.length;
        if (N == 1)
            return A[0];
        if (A[0] != A[1])
            return A[0];
        if (A[N - 1] != A[N - 2])
            return A[N - 1];
        int l = 1, r = N - 2;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int first = 0;
            if (A[mid] != A[mid - 1] && A[mid] != A[mid + 1])
                return A[mid];
            else if (A[mid] == A[mid + 1]) {
                first = mid;
            }
            else
                first = mid - 1;
            if (first % 2 == 0) {
                l = mid + 1;
            }
            else
                r = mid - 1;
        }
        return N;
    }
}
