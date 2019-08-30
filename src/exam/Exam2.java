package exam;

import java.util.*;

public class Exam2 {
    public static List<String> funWithAnagrams(List<String> s) {
        Map<String, String> removeAnagramMap = new TreeMap<>();
        for (String key : s) {
            char[] keyArr = key.toCharArray();
            Arrays.sort(keyArr);
            String value = String.valueOf(keyArr);
            if (!removeAnagramMap.containsValue(value)) {
                removeAnagramMap.put(key, value);
            }
        }
        return new ArrayList<>(removeAnagramMap.keySet());
    }
}
