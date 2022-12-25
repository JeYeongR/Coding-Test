class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        int start = 0;
        for (int i = 1; i <= number.length() - k; i++) {
            int max = -1;
            for (int j = start; j < k + i; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    idx = j;
                }
            }

            sb.append(max);
            start = idx+1;
        }

        answer = sb.toString();

        return answer;
    }
}