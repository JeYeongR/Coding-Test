class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];

        int idx = -1;
        char[] charArray = dartResult.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            String temp = "";
            if (Character.isDigit(charArray[i])) {
                temp += charArray[i];
                if (Character.isDigit(charArray[i + 1])) {
                    temp += charArray[i + 1];
                    i++;
                }
                score[++idx] = Integer.parseInt(temp);
            }

            if (charArray[i] == 'D') {
                score[idx] = (int) Math.pow(score[idx], 2);
            } else if (charArray[i] == 'T') {
                score[idx] = (int) Math.pow(score[idx], 3);
            } else if (charArray[i] == '*') {
                score[idx] *= 2;
                if (idx - 1 >= 0) score[idx - 1] *= 2;
            } else if (charArray[i] == '#') {
                score[idx] *= -1;
            }
        }

        for (int i : score) answer += i;

        return answer;
    }
}