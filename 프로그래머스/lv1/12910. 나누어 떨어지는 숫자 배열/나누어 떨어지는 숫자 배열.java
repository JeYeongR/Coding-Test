import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}