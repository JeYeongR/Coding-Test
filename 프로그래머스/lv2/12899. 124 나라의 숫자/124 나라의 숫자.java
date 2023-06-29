class Solution {
    public String solution(int n) {
        String answer = "";
        
        while(n>0) {
            int temp = n%3;
            n /= 3;
            
            if(temp==0) {
                answer = 4 + answer;
                n--;
            } else if(temp==1) {
                answer = 1 + answer;
            } else {
                answer = 2 + answer;
            }
        }
        
        return answer;
    }
}