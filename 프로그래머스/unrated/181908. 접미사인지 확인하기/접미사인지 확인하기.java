class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int length = my_string.length();
        String[] store = new String[length];
        
        for(int i=0; i<length; i++) {
            store[i] = my_string.substring(i);    
        }
        
        for(String str : store) {
            if(str.equals(is_suffix)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}