package wdz;

import java.util.Collections;

public class WdzSolution1 {
    public String solution(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int[] result = new int[Math.max(aIndex, bIndex) + 1];
        int resultIndex = result.length - 1;
        int upValue = 0;

        while (true) {
            int sum = 0;
            if (aIndex >= 0 && bIndex >= 0) {
                sum = Character.getNumericValue(a.charAt(aIndex)) + Character.getNumericValue(b.charAt(bIndex)) + upValue;
                aIndex--;
                bIndex--;
            } else if (aIndex < 0 && bIndex >= 0) {
                sum = (b.charAt(bIndex) - '0') + upValue;
                bIndex--;
            } else if (bIndex < 0 && aIndex >= 0) {
                sum = (a.charAt(aIndex) - '0') + upValue;
                aIndex--;
            } else {
                break;
            }
            upValue = Character.getNumericValue(String.valueOf(sum).charAt(0));
            result[resultIndex--] = Character.getNumericValue(String.valueOf(sum).charAt(1));
        }

        return "";
    }
}
