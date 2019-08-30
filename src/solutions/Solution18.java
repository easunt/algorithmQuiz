package solutions;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution18 {
    public int solution (int [] A) {
        Arrays.sort(A);
        if(A.length == 0)
            return 0;

        int answer = 1;
        for(int idx= 1;idx<A.length;idx++) {
            if(A[idx-1] != A[idx])
                answer++;
        }
        return answer;
    }
}
