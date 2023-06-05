import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
            answer = Math.max(answer, map.get(strArr[i].length()));
        }
        
        return answer;
    }
}