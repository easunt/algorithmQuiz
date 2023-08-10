package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Practice3 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int totalY = Arrays.stream(yearning).sum();
        Map<String, Integer> map = new HashMap<>();

        for (int idx = 0; idx < name.length; idx++) {
            map.put(name[idx], yearning[idx]);
        }

        for (int idx = 0; idx < photo.length; idx++) {
            HashSet<String> nameSet = new HashSet<>(Arrays.asList(name));
            HashSet<String> photoSet = new HashSet<>(Arrays.asList(photo[idx]));
            nameSet.removeAll(photoSet);
            int sum = totalY;

            while (nameSet.iterator().hasNext()) {
                String next = nameSet.iterator().next();
                sum -= map.get(next);
                nameSet.remove(next);
            }

            answer[idx] = sum;
        }

        return answer;
    }
}
