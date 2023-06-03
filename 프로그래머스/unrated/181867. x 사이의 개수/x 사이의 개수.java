class Solution {
    public int[] solution(String myString) {
        String[] strs = myString.split("x", -1);
        int[] answer = new int[strs.length];
        
        for(int i=0; i<strs.length; i++) {
            answer[i] = strs[i].length();
        }
        
        return answer;
    }
}