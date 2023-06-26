import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String s : record) {
            String[] split = s.split(" ");
            if (split[0].equals("Enter")) {
                map.put(split[1], split[2]);
                list.add(split[1] + "님이 들어왔습니다.");
            } else if (split[0].equals("Leave")) {
                list.add(split[1] + "님이 나갔습니다.");
            } else {
                map.put(split[1], split[2]);
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int idx = list.get(i).indexOf("님");
            answer[i] = map.get(list.get(i).substring(0, idx)) + list.get(i).substring(idx);
        }

        return answer;
    }
}