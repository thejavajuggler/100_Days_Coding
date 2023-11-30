package hundredDaysCode.arrays.dayOne;

public class UniqueElement {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 3, 2, 1};
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            int ele = A[i];
            for (int j = 0; j < A.length; j++) {
                if (ele == A[j])
                    count++;
            }
            if (count == 1) {
                System.out.println(A[i]);
            }
        }
        /*int element = A[0];
        for (int i = 1; i < A.length - 1; i++) {
            element = element>>A[i];
        }
        System.out.println(element);*/
    }
}
