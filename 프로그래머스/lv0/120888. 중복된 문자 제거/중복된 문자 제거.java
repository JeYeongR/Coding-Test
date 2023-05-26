class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strs = my_string.split("");
        
        int count = 1;
        for(int i=0; i<strs.length; i++) {
            if(!answer.contains(strs[i])) {
                answer += strs[i];
            }
        }
        
        return answer;
    }
}