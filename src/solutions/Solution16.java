package solutions;

import java.util.ArrayList;

public class Solution16 {
    public int solution(int[] A) {
        int answer = 0;
        int oneCount = 0;

        ArrayList<Integer> zeroPosition = new ArrayList<>();

        for (int idx = 0; idx < A.length; idx++) {
            if (A[idx] == 0) {
                zeroPosition.add(idx);
            } else {
                oneCount++;
            }
        }

        for (int idx = 0; idx < zeroPosition.size(); idx++) {
            if (idx != 0)
                oneCount = oneCount - (zeroPosition.get(idx) - zeroPosition.get(idx - 1) - 1);
            else {
                if (zeroPosition.get(idx) != 0)
                    oneCount = oneCount - zeroPosition.get(idx);
            }
            answer += oneCount;

            if (answer > 1000000000)
                return -1;
        }

        return answer;
    }
}
