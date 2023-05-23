class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        //1 5 9 13 17
        for(int i=0; i<my_string.length()/m; i++) {
            answer += my_string.charAt(c-1+m*i);
        }
        
        return answer;
    }
}