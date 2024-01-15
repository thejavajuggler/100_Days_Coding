package hundreddays.binarysearch.day1;

public class BinarySearchForIndex {

    /**
     * You are given a sorted array A of size N and a target value B.
     * Your task is to find the index (0-based indexing) of the target value in the array.
     *
     * If the target value is present, return its index.
     * If the target value is not found, return the index of least element greater than equal to B.
     * Your solution should have a time complexity of O(log(N)).*/

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6};
        int B = 7;
        System.out.println(findIndexOfGivenElementOrReturnNextGreatestElementIndex(A, B));
    }

    private static int findIndexOfGivenElementOrReturnNextGreatestElementIndex(int[] A, int B) {
        int N = A.length;
        int ans = N;
        if (A[0] >= B)
            return 0;
        if (A[N - 1] == B)
            return N - 1;
        if (A[N - 1] < B)
            return N;

        int l = 1;
        int r = N - 2;
        int mid = (l + r) / 2;
        while (l <= r) {
            mid = (l + r) / 2;
            if (A[mid] == B)
                return mid;
            else if (A[mid] > B) {
                ans = Math.min(ans, mid);
                r = mid - 1;
            }
            else
                l = mid + 1;
        }
        return ans;
    }
}
