package practice;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String name : callings) {
            Integer rank = map.get(name);

            String prev = players[rank - 1];
            players[rank - 1] = name;
            players[rank] = prev;

            map.put(name, rank - 1);
            map.put(prev, rank);
        }

        return players;
    }
}
