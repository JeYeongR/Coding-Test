import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map1 = new HashMap<>();
        
        for(int i=0; i<want.length; i++) {
            map1.put(want[i], number[i]);
        }
        
        for(int i=0; i<=discount.length - 10; i++) {
            Map<String, Integer> map2 = new HashMap<>();
            for(int j=0; j<10; j++) {
                map2.put(discount[i+j], map2.getOrDefault(discount[i+j], 0) + 1);
            }
            
            if(map1.equals(map2)) answer++;
        }
        
        return answer;
    }
}