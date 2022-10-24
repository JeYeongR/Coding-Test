import java.util.HashMap;

class Solution {
   public String solution(String[] participant, String[] completion) {
    	HashMap<String, Integer> hm = new HashMap<>(); 
		String answer = "";

		for( String i : participant) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			} else {
				hm.put(i, 1);
			}
		}
		for( String i : completion) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)-1);
			}
		}

		for(String i : hm.keySet()) {
			if(hm.get(i)>0) {
				answer = i;
			}
		}

		return answer;
	}
}