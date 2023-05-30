class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            String substring = myString.substring(0, myString.length() - i);
            if (substring.endsWith(pat)) {
                answer = substring;
                break;
            }
        }

        return answer; 
    }
}