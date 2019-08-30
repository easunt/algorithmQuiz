package solutions;

//codility CyclicRotation
public class Solution11 {
    public int[] solution(int[] A, int K) {
        if (A.length == 0)
            return A;

        for (int idx = 0; idx < K; idx++) {
            int last = A[A.length - 1];
            System.arraycopy(A, 0, A, 1, A.length - 1);
            A[0] = last;
        }
        return A;
    }
}

