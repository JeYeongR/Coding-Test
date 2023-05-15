class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        char[] chars = s.toCharArray();

        if (length == 4 || length == 6) {
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) answer = false;
            }
        } else {
            answer = false;
        }

        return answer;
    }
}