import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int max = -1;
        int idx = 0;
        for (Integer integer : map.keySet()) {
            if (map.containsKey(integer) && (map.get(integer) > max)) {
                    max = map.get(integer);
                    idx = integer;
            }
        }

        int count = 0;
        for (Integer integer : map.keySet()) {
            if (max == map.get(integer)) {
                count++;
            }
        }

        return count > 1 ? -1 : idx;
    }
}