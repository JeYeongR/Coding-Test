class Solution {
    public int solution(String s) {
        int answer = 0;
        int count1 = 0;
        int count2 = 0;
        char temp = s.charAt(0);
        for(int i=0; i<s.length(); i++) {
            if(temp==s.charAt(i)) count1++;
            else count2++;
            
            if(count1==count2) {
                answer++;
                count1 = 0;
                count2 = 0;
                if(i+1 < s.length()){
                    temp = s.charAt(i+1);
                }
            } else if(i==s.length()-1) {
                answer++;
            }
        }
        
        return answer;
    }
}