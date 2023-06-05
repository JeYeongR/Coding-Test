import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int num = 1;
        while(num < length) {
            num *= 2;
        }
        length = num;
        
        int[] answer = new int[length];
        Arrays.fill(answer, 0);
        
        for(int i=0; i<arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}