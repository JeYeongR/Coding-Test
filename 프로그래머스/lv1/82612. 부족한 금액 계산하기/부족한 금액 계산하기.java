class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for(int i=1; i<=count; i++) {
            sum += (long) price*i;
        }
        
        long answer = sum - money;
        
        if(answer<0) return 0;
        
        return answer;
    }
}