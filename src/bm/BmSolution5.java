package bm;

import java.util.Arrays;

public class BmSolution5 {
    public int[] solution(int[] card) {
        Arrays.sort(card);
        int[] result = new int[2];
        int resultIdx = 0;

        for (int idx = 0; idx < card.length; ) {
            if (idx == card.length - 1) {
                result[resultIdx] = card[idx];
                break;
            }

            if (card[idx] == card[idx + 1]) {
                idx += 2;
            } else {
                result[resultIdx++] = card[idx];
                idx++;
            }
        }

        return result;
    }

}
