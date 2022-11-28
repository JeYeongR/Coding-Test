import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
       int answer = 0;
        HashMap<String, Integer> spy = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            spy.put(clothes[i][1], 0);
        }

        for (int i = 0; i < clothes.length; i++) {
            if (spy.containsKey(clothes[i][1])) {
                spy.put(clothes[i][1], spy.get(clothes[i][1]) + 1);
            }
        }

        int multiply = 1;
        for (int i : spy.values()) {
            multiply *= (i+1);
        }

        answer = multiply - 1;

        return answer;
    }
}