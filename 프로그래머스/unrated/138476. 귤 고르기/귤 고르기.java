import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            list.add(map.get(num));
        }

        list.sort(Comparator.reverseOrder());

        for (int num : list) {
            k -= num;
            answer++;

            if (k <= 0) break;
        }

        return answer;
    }
}