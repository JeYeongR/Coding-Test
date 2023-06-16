class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                int min = Integer.MAX_VALUE;
                for (String s : keymap) {
                    int idx = s.indexOf(targets[i].charAt(j)) + 1;
                    if (idx != 0) {
                        min = Math.min(idx, min);
                    }
                }
                if (min == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                } else {
                    System.out.println("min = " + min);
                    answer[i] += min;
                }
            }
        }
        return answer;
    }
}