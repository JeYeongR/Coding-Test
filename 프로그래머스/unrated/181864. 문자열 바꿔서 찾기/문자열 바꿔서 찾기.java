class Solution {
    public int solution(String myString, String pat) {
        String change = "";
        for(char c : myString.toCharArray()) {
            if(c=='A') {
                change += 'B';
            } else {
                change += 'A';
            }
        }
        
        return change.contains(pat) ? 1 : 0;
    }
}