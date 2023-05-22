class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        int lt = s;
        int rt = e;
        while(lt < rt) {
            char temp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = temp;
            lt++;
            rt--;
        }
        
        for(char c : chars) {
            answer += c;
        }
        
        return answer;
    }
}