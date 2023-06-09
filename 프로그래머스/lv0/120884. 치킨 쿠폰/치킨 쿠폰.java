class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        int coupon = chicken;
        while(coupon >= 10) {
            int service = coupon / 10;
            int restCoupon = coupon % 10;
            coupon = service + restCoupon;
            answer += service;
        } 
        
        return answer;
    }
}