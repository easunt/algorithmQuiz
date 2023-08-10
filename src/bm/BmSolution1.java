package bm;

import java.util.Arrays;

public class BmSolution1 {
    public String solution(String[] params) {
        return Arrays.stream(params)
                .map(String::toUpperCase)
                .filter(str -> str.length() >=5 && str.length() <= 10)
                .findFirst()
                .orElse("없음");
    }
}
