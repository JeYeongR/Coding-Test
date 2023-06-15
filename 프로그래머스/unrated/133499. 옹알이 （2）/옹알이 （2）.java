class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canBabbling = new String[]{"aya", "ye", "woo", "ma"};

        for (String value : babbling) {
            if(value.contains("ayaaya") || value.contains("yeye") || value.contains("woowoo")|| value.contains("mama")) continue;
                
            for (String s : canBabbling) {
                value = value.replace(s, "*");
            }

            value = value.replace("*","");

            if (value.isEmpty()) answer++;
        }

        return answer;
    }
}