class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()) {
            if(c - 'l' < 0) {
                answer += 'l';
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}