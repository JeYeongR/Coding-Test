import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int min = 101;
        int idx = 0;
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (min > Math.abs(array[i] - n)) {
                min = Math.abs(array[i] - n);
                idx = i;
            }
        }

        return array[idx];
    }
}