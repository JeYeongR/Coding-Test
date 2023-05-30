class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] strings = quiz[i].split(" ");
            if (strings[1].equals("+")) {
                if (Integer.parseInt(strings[0]) + Integer.parseInt(strings[2]) == Integer.parseInt(strings[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (Integer.parseInt(strings[0]) - Integer.parseInt(strings[2]) == Integer.parseInt(strings[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }
}