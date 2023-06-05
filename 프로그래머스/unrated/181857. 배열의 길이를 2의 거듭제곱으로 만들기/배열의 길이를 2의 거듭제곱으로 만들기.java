import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int num = 1;
        while(num < length) {
            num *= 2;
        }
        
        int[] answer = new int[num];
        Arrays.fill(answer, 0);
        
        for(int i=0; i<length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}