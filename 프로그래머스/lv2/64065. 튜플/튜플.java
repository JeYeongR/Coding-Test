import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        String[] split = s.substring(2, s.length() - 2)
                .replace("},{", " ")
                .split(" ");

        Arrays.sort(split, Comparator.comparingInt(String::length));

        for (String s1 : split) {
            for (String s2 : s1.split(",")) {
                Integer num = Integer.valueOf(s2);
                if(!list.contains(num)) {
                    list.add(num);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}