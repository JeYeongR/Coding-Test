import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Integer> notClear = new HashMap<>();
        Map<Integer, Integer> arrival = new HashMap<>();
        Map<Integer, Float> fail = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            for (int stage : stages) {
                if (stage == i) {
                    notClear.put(i, notClear.getOrDefault(i, 0) + 1);
                }

                if (stage >= i) {
                    arrival.put(i, arrival.getOrDefault(i, 0) + 1);
                }
            }

            float num = 0;
            if (notClear.get(i) != null && arrival.get(i) != null) num = (float) notClear.get(i) / arrival.get(i);

            fail.put(i, num);
        }

        int num = 0;
        for (int i = 0; i < N; i++) {
            float max = -1;
            for (int j = 1; j <= N; j++) {
                if (max < fail.get(j)) {
                    max = fail.get(j);
                    num = j;
                }
            }
            answer[i] = num;
            fail.put(num, (float) -1);
        }

        return answer;
    }
}