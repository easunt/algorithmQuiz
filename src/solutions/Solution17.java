package solutions;

import java.util.Arrays;

public class Solution17 {
    public int solution(int[] A) {
        int answer;
        if (A.length == 3) {
            return A[0] * A[1] * A[2];
        }

        Arrays.sort(A);

        if (A[0] < 0 && A[1] < 0){
            answer = A[0]*A[1]*A[A.length-1] > A[A.length-3]*A[A.length-2]*A[A.length-1] ? A[0]*A[1]*A[A.length-1] :  A[A.length-3]*A[A.length-2]*A[A.length-1];
        } else {
            answer = A[A.length-3]*A[A.length-2]*A[A.length-1];
        }

        return answer;
    }
}
