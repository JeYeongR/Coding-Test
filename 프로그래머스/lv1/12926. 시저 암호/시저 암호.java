class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (aChar == ' ') {
                answer += aChar;
                continue;
            }

            if (Character.isLowerCase(aChar)) {
                if (aChar + n > 'z') {
                    answer += (char) (aChar - 26 + n);
                } else {
                    answer += (char) (aChar + n);
                }
            } else {
                if (aChar + n > 'Z') {
                    answer += (char) (aChar - 26 + n);
                } else {
                    answer += (char) (aChar + n);
                }
            }
        }
        
        return answer;
    }
}