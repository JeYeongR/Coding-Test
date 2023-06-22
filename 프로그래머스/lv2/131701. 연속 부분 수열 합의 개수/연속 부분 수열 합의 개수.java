import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            int value = 0;
            for (int j = 0; j < elements.length; j++) {
                for (int k = 0; k < i; k++) {
                    value += elements[(j+k) % elements.length];
                }
                set.add(value);
                value = 0;
            }
        }

        return set.size();
    }
}