package hundredDaysCode.arrays.dayOne;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 3 ,6, 3, 7};
        int freq = 0;
        int k = 3;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == k)
                freq++;
        }
        if (freq == 0)
            System.out.println("Element not present");
        else
            System.out.println("Frequency of element " + k + " is: c" + freq);
    }
}
