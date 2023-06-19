import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        
        String last = "";
        for(int i=1; i<=words.length; i++) {
            String temp =words[i-1];
            if(list.contains(temp) || !temp.startsWith(last)) {
                if(i%n == 0) {
                    answer[0] = n;
                    answer[1] = i/n;
                } else {
                    answer[0] = i%n;
                    answer[1] = i/n + 1;
                }
                break;
            } else {
                list.add(temp);
                last = temp.substring(temp.length()-1);
            }
        }
        
        return answer;
    }
}