import java.util.ArrayList;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        char[] chars = my_string.toCharArray();

        for (char aChar : chars) {
            if(Character.isDigit(aChar)) {
                list.add(Integer.parseInt(String.valueOf(aChar)));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        return answer;
    }
}