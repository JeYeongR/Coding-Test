import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sort = emergency.clone();
        Arrays.sort(sort);

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < sort.length; j++) {
                if (emergency[i] == sort[j]) {
                    answer[i] = sort.length - j;
                }
            }
        }

        return answer;
    }
}