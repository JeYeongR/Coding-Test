class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};

        int idx = -1;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") || str_list[i].equals("r")) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            if (str_list[idx].equals("l")) {
                answer = new String[idx];
                for (int i = 0; i < idx; i++) {
                    answer[i] = str_list[i];
                }
            } else {
                answer = new String[str_list.length - idx - 1];
                for (int i = idx + 1; i < str_list.length; i++) {
                    answer[i - idx - 1] = str_list[i];
                }
            }
        }

        return answer;
    }
}