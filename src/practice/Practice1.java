package practice;

import java.util.*;

public class Practice1 {
    public int[] solution(int[] sequence, int k) {
        int left = 0;
        int right = 0;
        int sum = sequence[0]; // 부분 수열의 합
        int size = sequence.length;

        List<int[]> result = new ArrayList<>();
        while (true) {
            // 현재 부분 수열의 합과 k가 일치하는 left와 right를 저장함
            if (sum == k) {
                result.add(new int[]{left, right});
            }
            if (left == size && right == size) break;

            if (sum <= k && right < size) {
                right++;
                if (right < size) sum += sequence[right];
            } else {
                if (left < size) sum -= sequence[left];
                left++;
            }
        }

        // 조건에 가장 일치하는 부분 수열을 맨 앞으로 정렬
        int minLength = result.stream().mapToInt(v -> v[1] - v[0]).min().orElseThrow(RuntimeException::new);
        return result.stream().filter(w -> w[1] - w[0] == minLength).min(Comparator.comparing(w -> w[0])).orElseThrow(RuntimeException::new);
    }
}
