class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int num : array) {
            if(num == n) answer++;
        }
        
        return answer;
    }
}