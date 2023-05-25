import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        char[] chars = my_string.toCharArray();

        for (char aChar : chars) {
            if(Character.isDigit(aChar)) {
                list.add(Integer.parseInt(String.valueOf(aChar)));
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}