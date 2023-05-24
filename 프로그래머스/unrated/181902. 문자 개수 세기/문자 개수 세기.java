class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = 0;
        }
        
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) > 90) {
                answer[my_string.charAt(i) - 71]++;
            } else {
                answer[my_string.charAt(i) - 65]++;
            }
        }
        
        return answer;
    }
}