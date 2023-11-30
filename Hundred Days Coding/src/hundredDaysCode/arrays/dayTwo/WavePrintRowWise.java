package hundredDaysCode.arrays.dayTwo;

public class WavePrintRowWise {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //row wise print
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i % 2 == 0) {
                    System.out.println(A[i][j]);
                }
                else
                    System.out.println(A[i][A[i].length - j - 1]);
            }
        }

        //column wise print
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i % 2 == 0)
                    System.out.println(A[j][i]);
                else System.out.println(A[A.length - j - 1][i]);
            }
        }
        /* while (i % 2 == 0 ) {
            System.out.println(A[i][j]);
            j++;
            if (j == A.length - 1) {
                System.out.println(A[i][j]);
                i++;
            }

        }
        while (i % 2 == 1) {
            System.out.println(A[i][j]);
            j--;
            if(j == 0) {
                System.out.println(A[i][j]);
                i++;

            }
        }*/
    }
}
