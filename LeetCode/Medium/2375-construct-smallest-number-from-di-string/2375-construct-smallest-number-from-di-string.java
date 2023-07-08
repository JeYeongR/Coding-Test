class Solution {
    public String smallestNumber(String pattern) {
        String[] split = pattern.split("");

        int num = 1;
        int[] arr = new int[split.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num++;
        }

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("D")) {
                int idx = i;
                while (idx < split.length && !split[idx].equals("I")) {
                    idx++;
                }

                int lt = idx;
                int rt = i;
                while (lt > rt) {
                    int temp = arr[rt];
                    arr[rt++] = arr[lt];
                    arr[lt--] = temp;
                }

                i = idx;
            }
        }

        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}