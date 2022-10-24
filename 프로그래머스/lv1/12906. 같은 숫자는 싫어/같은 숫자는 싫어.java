import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
      ArrayList<Integer> al = new ArrayList<Integer>();
		int[] answer = {};
		int rs = 10;
		
		for(int i : arr ) {
			if(i!=rs) {
				al.add(i);
				rs = i;
			}
		}
		
		answer = new int[al.size()];
		for(int i=0; i<al.size(); i++) {
			answer[i] = al.get(i);
		}

		return answer;
    }
}