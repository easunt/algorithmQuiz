package solutions;

public class Solution20 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (; n >= 3; n = n / 3) {
            answer.append(n % 3);

        }
        answer.append(n);
        answer.reverse();
        return answer.toString().replaceAll("10", "4");
    }
}
