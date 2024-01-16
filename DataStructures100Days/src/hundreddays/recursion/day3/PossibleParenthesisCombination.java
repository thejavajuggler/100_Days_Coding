package hundreddays.recursion.day3;

import java.util.ArrayList;

public class PossibleParenthesisCombination {


    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();

        int N = 3;
        possibleParenthesis(N, 0,N * 2, str, "");
        System.out.println(str);
    }

    private static void possibleParenthesis(int count, int diff, int totalCount, ArrayList<String> str,  String s) {
        if (totalCount == 0) {
            str.add(s);
            return;
        }
        if (count > 0) {
            possibleParenthesis(count - 1,  diff + 1, totalCount - 1, str, s +"(");
        }
        if (diff > 0)
            possibleParenthesis(count,  diff - 1, totalCount - 1, str, s +")");
    }
}
