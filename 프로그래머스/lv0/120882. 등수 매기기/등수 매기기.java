import java.util.*;

class Solution {
  public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> list = new ArrayList<>();
        for (int[] num : score) {
            list.add(num[0] + num[1]);
        }

        list.sort(Comparator.reverseOrder());

        for (int i = 0; i < score.length; i++) {
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
        }

        return answer;
    }
}