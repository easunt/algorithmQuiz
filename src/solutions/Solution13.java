package solutions;

//codility maxCounter
public class Solution13 {
    public int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        int temp = 0;
        int max = 0;

        for(int index : A) {
            if(index > N) {
                temp = max;
                continue;
            }
            index--;
            if(counter[index] <= temp) {
                counter[index] = temp;
            }
            counter[index]++;

            if(counter[index] > max) {
                max = counter[index];
            }
        }

        for(int idx = 0; idx < counter.length; idx++) {
            if(counter[idx] < temp)
                counter[idx] = temp;
        }

        return counter;
    }
}
