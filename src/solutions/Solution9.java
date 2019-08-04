package solutions;

public class Solution9 {
    public int solution(int n) {
        int answer = 0;
        int zeroCount = 0;
        String binaryString = Integer.toBinaryString(n);

        for (int idx = 0; idx < binaryString.length(); idx++) {

            if (binaryString.charAt(idx) == '0') {
                zeroCount++;
            } else {
                if (answer < zeroCount) {
                    answer = zeroCount;
                }
                zeroCount = 0;
            }
        }

        return answer;
    }
}
