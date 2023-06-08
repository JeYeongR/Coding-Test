import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int length = numlist.length;
        int[] answer = new int[length];
        double[] temp = new double[length];
    
        for(int i=0; i<length; i++) {
            if(numlist[i] - n >= 0) temp[i] = numlist[i] - n;            
            else temp[i] = Math.abs(numlist[i] - n) + 0.5;
        }
        
        Arrays.sort(temp);
        
        for(int i=0; i<length; i++) {
            if(temp[i]%1==0) answer[i] = (int) temp[i] + n;
            else answer[i] = n - (int) temp[i];
        }
        
        return answer;
    }
}