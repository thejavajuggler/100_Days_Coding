package hundredDaysCode.arrays.dayTwo;

public class CountPairWithGivenSum {
    public static void main(String[] args) {
        int[] A = {1,2,3,2,1};
        int num = 5;
        System.out.println(noOfPairsOfSum(A, num));
    }

    private static int noOfPairsOfSum(int[] A, int num) {
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == num)
                    count++;
            }
        }
        return count;
    }
}
