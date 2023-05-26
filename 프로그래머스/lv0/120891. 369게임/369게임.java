class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order>0) {
            int num = order%10;
            if(num!=0) {
                if(num%3==0){
                    answer++;
                }
            }
            
            order/=10;
        }
        
        return answer;
    }
}