import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int count[] = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (person1[i%5] == answers[i]) {
                count[0]++;
            }
            if (person2[i%8] == answers[i]) {
                count[1]++;
            }
            if (person3[i%10] == answers[i]) {
                count[2]++;
            }
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<count.length; i++) {
            if(max == count[i]) {
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}