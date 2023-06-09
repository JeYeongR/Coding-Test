class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        for (String str : picture) {
            char[] chars = str.toCharArray();
            String temp = "";
            for (char aChar : chars) {
                for (int j = 0; j < k; j++) {
                    temp += aChar;
                }
            }

            for (int j = 0; j < k; j++) {
                answer[idx++] = temp;
            }
        }

        return answer;
    }
}