package hundredDaysCode.arrays.dayTwo;

public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        int[] A = {1,2,3,2,1, 1};
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                count++;
            }
        }
        if (count > 0)
            System.out.println("Duplicate present");
        else
            System.out.println("No duplicates");

    }
}
