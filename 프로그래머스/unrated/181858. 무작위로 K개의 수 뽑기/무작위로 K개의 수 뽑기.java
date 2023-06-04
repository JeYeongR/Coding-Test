import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        int idx = 0;
        for (int num : arr) {
            if (!set.contains(num)) {
                answer[idx++] = num;
                set.add(num);
            }

            if (idx == k) break;
        }

        return answer;
    }
}