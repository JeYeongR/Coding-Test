import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] temp = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();

        for (String s : temp) {
            if (!s.isBlank()) {
                list.add(s);
            }
        }
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}