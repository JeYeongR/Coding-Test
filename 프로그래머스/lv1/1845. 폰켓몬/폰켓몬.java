import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
		int answer = 0;
		for( int i : nums) {
			hs.add(i);
		}
		
		if(hs.size()>=nums.length/2) {
			answer = nums.length/2;
		} else {
			answer = hs.size();
		}
		return answer;
    }
}