import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) map.put(rank[i], i);
        }

        int num = 1;
        for (Integer value : map.values()) {
            answer += 10000 / num * value;
            num *= 100;
            
            if(num > 10000) break;
        }

        return answer;
    }
}