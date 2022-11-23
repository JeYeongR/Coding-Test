import java.util.LinkedList;
import java.util.Queue;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Queue<Character> queue = new LinkedList<>();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }

        if (queue.peek().equals(')')) {
            answer = false;
            return answer;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (queue.peek().equals('(')) {
                count++;
            } else {
                count--;
                if (count < 0) {
                    return answer = false;
                }
            }
            queue.poll();
        }

        if(count!=0) {
            answer = false;
        }

        return answer;
    }
}