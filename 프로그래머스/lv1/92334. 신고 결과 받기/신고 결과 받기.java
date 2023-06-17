import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            map.put(id, new HashSet<>());
            idxMap.put(id, i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from);
        }

        for (String id : id_list) {
            HashSet<String> send = map.get(id);
            if (send.size() >= k) {
                for (String fromId : send) {
                    answer[idxMap.get(fromId)]++;
                }
            }
        }
        return answer;
    }
}