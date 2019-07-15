package solutions;

import java.util.Arrays;

public class Solution8 {
    public int[] solution(int n, int s) {
        if (s < n) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int[] array = new int[n];
        int startValue = s - (n - 1);
        array[0] = startValue;
        for (int i = 1; i < array.length; i++) {
            array[i] = 1;
        }
        int[] answer = new int[n];
        int max = 0;
        int index = 1;
        while (true) {
            int now = getMulti(array);

            if(max < now){
                max = now;
                answer = Arrays.copyOf(array, array.length);
            }
            if(array[0] == 1)
                break;

            array[0] = array[0] - 1;
            array[index] = array[index] + 1;
            index++;
            if (index == array.length)
                index = 1;


        }
        Arrays.sort(answer);
        return answer;
    }

    private int getMulti(int[] array) {
        int val = 1;
        for (int value : array) {
            val = val * value;
        }
        return val;
    }
}
