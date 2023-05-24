class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        for(int num : box) {
            answer *= num/n;
        }
        
        return answer;
    }
}