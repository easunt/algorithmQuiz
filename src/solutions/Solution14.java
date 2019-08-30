package solutions;

import java.util.Arrays;

public class Solution14 {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[A.length - 1] < 1)
            return 1;

        int max = A[A.length - 1];
        int min = A[0];
        int[] tempArray;

        if (min > 0) {
            tempArray = new int[A.length+1];
            System.arraycopy(A, 0, tempArray, 1, A.length);
            min = 0;
        } else {
            tempArray = A;
        }

        for (int value = min; value <= max; value++) {
            if (value > 0) {
                int index = Arrays.binarySearch(tempArray, value);
                if (index < 0)
                    return value;
            }

        }
        return max + 1;

    }
}
