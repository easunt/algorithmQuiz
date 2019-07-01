package solutions;
import java.util.Arrays;

public class Solution5 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int ansIndex = 0;
        for (int[] element : commands) {
            int[] temp = new int[element[1] - element[0]+1];
            int tempIndex = 0;
            for (int idx = element[0] - 1; idx < element[1]; idx++) {
                temp[tempIndex++] = array[idx];
            }
            Arrays.sort(temp);
            answer[ansIndex++] = temp[element[2]-1];
        }
        return answer;
    }
}
