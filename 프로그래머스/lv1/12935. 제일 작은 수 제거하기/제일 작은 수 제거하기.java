import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length -1];
        int[] save = arr.clone();
        Arrays.sort(arr);
        
        if (answer.length == 0) {
            return new int[]{-1};
        }
        
        for(int i=0;i<save.length;i++) {
            if(arr[0]==save[i]) {
                save[i] = 0;
            }    
        }
        
        int idx = 0;
        for (int num : save) {
            if (num != 0) {
                answer[idx] = num;
                idx++;
            }
        }
        
        return answer;
    }
}