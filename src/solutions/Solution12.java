package solutions;
import java.util.Arrays;

//codility PermMissingElem
public class Solution12 {

    public int solution(int[] A) {
        if (A.length == 0 || A.length == 1) {
            return 0;
        }
        Arrays.sort(A);
        for (int idx = 0; idx < A.length - 1; idx++) {
            if (-(A[idx] - A[idx + 1]) > 1) {
                return A[idx] + 1;
            }
        }
        return 0;
    }
}
