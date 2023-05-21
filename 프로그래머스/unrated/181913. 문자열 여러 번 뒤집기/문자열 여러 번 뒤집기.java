class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] chars = my_string.toCharArray();

        for (int[] query : queries) {
            int lt = query[0];
            int rt = query[1];
            while (lt < rt) {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }

        for (char aChar : chars) {
            answer += aChar;
        }

        return answer;
    }
}