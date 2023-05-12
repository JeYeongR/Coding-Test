class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int num : numbers) {
            answer += num;
        }
        
        return 45 - answer;
    }
}