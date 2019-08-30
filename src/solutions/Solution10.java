package solutions;
import java.util.Arrays;

//codility OddOcuurencesInArray
public class Solution10 {
    public int solution(int[] A) {
        int answer = 0;
        if (A.length == 1)
            return A[0];

        Arrays.sort(A);

        int count = 0;
        int idx;
        for (idx = 0; idx < A.length - 1; idx++) {
            count++;
            if (A[idx] != A[idx + 1]) {
                if (count % 2 == 1) {
                    answer = A[idx];
                    break;
                } else {
                    count = 0;
                }
            }
        }

        if(idx == A.length - 1)
            return A[A.length-1];

        return answer;
    }
}

