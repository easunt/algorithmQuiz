package bm;

import java.util.*;
import java.util.stream.Collectors;

public class BmSolution2 {
    public String solution(String[] leftArray, String[] rightArray) {

        Set<String> leftSet = new HashSet<>(Arrays.asList(leftArray));
        Set<String> rightSet = new HashSet<>(Arrays.asList(rightArray));

        TreeSet<String> resultSet = new TreeSet<>();

        leftSet.forEach(target -> {
            if (rightSet.contains(target)) {
                resultSet.add(target);
            }
        });

        return resultSet.isEmpty() ? "" : resultSet.stream().map(Objects::toString).collect(Collectors.joining(","));
    }
}
