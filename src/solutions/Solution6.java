package solutions;

import java.util.Arrays;

public class Solution6 {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        Target[] targets = new Target[numbers.length];

        for (int idx = 0; idx < numbers.length; idx++) {
            targets[idx] = new Target(Integer.toString(numbers[idx]));
        }
        Arrays.sort(targets);
        for (int idx = targets.length - 1; idx >= 0; idx--) {
            answer.append(targets[idx].value);
        }
        try {
            if (Integer.parseInt(answer.toString()) == 0)
                return "0";
        } catch (Exception e) {
        }

        return answer.toString();
    }

    public class Target implements Comparable<Target> {
        String value;
        public Target(String value){
            this.value = value;
        }
        @Override
        public int compareTo(Target o) {
            String x = this.value + o.value;
            String y = o.value + this.value;

            return x.compareTo(y);
        }
    }
}
