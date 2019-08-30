package others;

import java.util.ArrayList;
import java.util.List;

public class Others1 {

    public int solution(String S) {
        String[] strArr = S.split("");
        List<String> dgramList = new ArrayList<>();
        int result = -1;

        for (int i = 0; i < strArr.length - 1; i++) {
            dgramList.add(strArr[i] + strArr[i + 1]);
        }

        for (int i = 0; i < dgramList.size(); i++) {
            String dgram = dgramList.get(i);
            dgramList.set(i, "CHECK");

            int point = dgramList.lastIndexOf(dgram);
            result = Math.max(point - i, result);
        }

        return result;
    }
}
