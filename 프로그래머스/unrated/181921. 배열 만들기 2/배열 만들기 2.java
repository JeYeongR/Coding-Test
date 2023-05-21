import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 5 != 0) continue;

            boolean isZeroOrFive = true;
            int temp = i;
            while (temp > 0) {
                int num = temp % 10;
                temp /= 10;
                if (num != 5 && num != 0) {
                    isZeroOrFive = false;
                    break;
                }
            }

            if (isZeroOrFive) {
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}