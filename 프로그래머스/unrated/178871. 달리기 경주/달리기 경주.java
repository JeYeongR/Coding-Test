import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        int idx;
        String temp;
        for (String calling : callings) {
            idx = map.get(calling);

            if (idx != 0) {
                temp = players[idx - 1];
                players[idx - 1] = players[idx];
                players[idx] = temp;
                map.put(players[idx - 1], idx - 1);
                map.put(players[idx], idx);
            }
        }

        return players;
    }
}