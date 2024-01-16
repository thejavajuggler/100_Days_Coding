package hundreddays.recursion.day3;

public class RobberyProblem {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 100, 2, 4};
        System.out.println(maximumLoot(A, A.length - 1));
    }

    private static int maximumLoot(int[] A, int N) {
        int ans = 0;
        if (N <= 0)
            return 0;
        if (N == 0)
            return A[0];
        int houseToSelect = A[N] + maximumLoot(A, N - 2);
        int houseNotSelect = maximumLoot(A, N - 1);
        ans = Math.max(houseToSelect, houseNotSelect);
        return ans;
    }
}
