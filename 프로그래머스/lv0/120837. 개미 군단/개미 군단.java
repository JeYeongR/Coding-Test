class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        while(hp >= 5) {
            hp -= 5;
            answer++;
        }
        
        while(hp >= 3) {
            hp -= 3;
            answer++;
        }
        
        return answer + hp;
    }
}