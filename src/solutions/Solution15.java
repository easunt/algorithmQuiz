package solutions;

public class Solution15 {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];

        for (int idx = 0; idx < P.length; idx++) {
            int start = P[idx];
            int end = Q[idx];
            String subString = S.substring(start, end + 1);

            if (subString.contains("A"))
                result[idx] = 1;
            else if (subString.contains("C"))
                result[idx] = 2;
            else if (subString.contains("G"))
                result[idx] = 3;
            else
                result[idx] = 4;
        }

        return result;
    }
}
