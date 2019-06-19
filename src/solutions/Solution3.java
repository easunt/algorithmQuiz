package solutions;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> waiting = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        int[] timeArr = new int[truck_weights.length];

        int sum = 0;
        int time = 1;
        int arrCnt = 0;
        int index = 0;


        for (int truck : truck_weights)
            waiting.offer(truck);

        while (true) {
            if (timeArr[arrCnt] == bridge_length) {
                sum -= bridge.poll();
                arrCnt++;
                if (bridge.isEmpty() && waiting.isEmpty()) break;
            }
            if (!waiting.isEmpty() && weight >= sum + waiting.peek()) {
                int truck = waiting.poll();
                bridge.offer(truck);
                sum += truck;
                timeArr[index++] = 0;
            }

            for (int idx = 0; idx < timeArr.length; idx++) {
                timeArr[idx] = timeArr[idx] + 1;
            }
            time++;
        }
        return time;
    }
}
