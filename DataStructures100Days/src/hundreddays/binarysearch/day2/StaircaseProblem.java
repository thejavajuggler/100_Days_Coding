package hundreddays.binarysearch.day2;

/**
 * Given an integer A representing the number of square blocks. The height of each square block is 1. The task is to create a staircase of max-height using these blocks.
 *
 * The first stair would require only one block, and the second stair would require two blocks, and so on.
 *
 * Find and return the maximum height of the staircase.
 *
 *
 *
 * Problem Constraints
 * 0 <= A <= 109
 *
 *
 * Input Format
 * The only argument given is integer A.
 *
 *
 *
 * Output Format
 * Return the maximum height of the staircase using these blocks.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 10
 * Input 2:
 *
 *  A = 20
 *
 *
 * Example Output
 * Output 1:
 *
 *  4
 * Output 2:
 *
 *  5
 */

public class StaircaseProblem {
    public static void main(String[] args) {
        int A = 10;
        System.out.println(noOfStairsPossible(A));
    }

    private static int noOfStairsPossible(int A) {
        int l = 0, r = 1000 * 1000 * 1000, ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long)mid * (mid + 1) / 2 > A) {
                r = mid - 1;
            }
            else {
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
       /* int low = 0, high = 1000*1000*1000, ans = 0;
        while(low <= high){
            int mid = (high - low) / 2 + low;
            if((long)mid * (mid + 1) / 2 > A)
                high = mid - 1;
            else{
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;*/
    }
}
