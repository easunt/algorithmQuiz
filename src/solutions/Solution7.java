package solutions;

import java.util.Arrays;

public class Solution7 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int max = citations[citations.length-1];
        int idx = 0;
        while(idx <= max){
            int count = 0;
            for(int element : citations){
                if(element >= idx)
                    count++;
            }
            if(idx <= count)
                answer = idx;
            idx++;
        }

        return answer;
    }
}
