class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] strs = binomial.split(" ");
        
        if(strs[1].equals("+")) {
            answer = Integer.parseInt(strs[0]) + Integer.parseInt(strs[2]);
        } else if(strs[1].equals("-")) {
            answer = Integer.parseInt(strs[0]) - Integer.parseInt(strs[2]);
        } else {
            answer = Integer.parseInt(strs[0]) * Integer.parseInt(strs[2]);
        }
        
        return answer;
    }
}