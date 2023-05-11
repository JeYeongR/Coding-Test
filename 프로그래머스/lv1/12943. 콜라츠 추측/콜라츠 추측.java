class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = (long) num;
        
        while(temp!=1) {
            temp = temp % 2 == 0 ? temp / 2 : temp * 3 + 1;
            answer++;
            
            if(answer==500) {
                return answer = -1;    
            }
        }
        return answer;
    }
}