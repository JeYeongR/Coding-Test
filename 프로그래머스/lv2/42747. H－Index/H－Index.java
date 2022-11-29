import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        // 내림차순 정렬을 위해 변환시킴
        Integer[] idx = Arrays.stream(citations).boxed().toArray(Integer[]::new);

        Arrays.sort(idx, Collections.reverseOrder());

        for (int i = 1; i <= citations.length; i++) {
            if (i > idx[i-1]) {
                    answer = i-1;
                    break;
            } 
        }
        
        if(idx[0] != 0 && answer==0) {
            answer = idx.length;
        }

        return answer;
    }
}