import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        List<Integer> temp = new ArrayList<>();


        if (map.size() == 1) {
            answer = 1111 * a;
        } else if (map.size() == 2) {
            int idx = 0;
            int idx2 = 0;
            for (Integer num : map.keySet()) {
                if (map.get(num) == 3) {
                    idx = num;
                } else if (map.get(num) == 1) {
                    idx2 = num;
                }
            }
            answer = (int) Math.pow((10 * idx + idx2), 2);

            if (idx == 0) {
                for (Integer num : map.keySet()) {
                    if (map.get(num) == 2) {
                        temp.add(num);
                    }
                }

                answer = (temp.get(0) + temp.get(1)) * Math.abs(temp.get(0) - temp.get(1));
            }
        } else if (map.size() == 3) {
            for (Integer num : map.keySet()) {
                if (map.get(num) == 1) {
                    temp.add(num);
                }
            }

            for (Integer integer : temp) {
                answer *= integer;
            }
        } else {
            int min = 7;
            for (Integer num : map.keySet()) {
                min = Math.min(min, num);
            }

            answer = min;
        }

        return answer;
    }
}