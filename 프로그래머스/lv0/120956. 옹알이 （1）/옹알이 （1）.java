class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canBabbling = new String[]{"aya", "ye", "woo", "ma"};

        for (String value : babbling) {
            String temp = value;
            for (String s : canBabbling) {
                temp = temp.replace(s, "**");
            }

            temp = temp.replace("*","");

            if (temp.isEmpty()) answer++;
        }

        return answer;
    }
}