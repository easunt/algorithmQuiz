package wdz;

import java.util.ArrayList;
import java.util.List;

public class WdzSolution2 {
    public int solution(int[] stats) {
        List<Integer> results = new ArrayList<>();

        for (int targetNumber : stats) {
            if (results.isEmpty()) {
                results.add(targetNumber);
            } else {
                int minValue = Integer.MAX_VALUE;
                int minIndex = -1;
                for (int idx = 0; idx < results.size(); idx++) {
                    int diff = targetNumber - results.get(idx);
                    if (diff > 0 && diff < minValue) {
                        minValue = diff;
                        minIndex = idx;
                    }
                }
                if (minIndex == -1) {
                    results.add(targetNumber);
                } else {
                    results.set(minIndex, targetNumber);
                }
            }
        }
        return results.size();
    }

}
