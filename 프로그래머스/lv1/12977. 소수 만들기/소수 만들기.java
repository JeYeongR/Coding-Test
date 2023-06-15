class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if(isPrime(num)) answer++;
                }
            }
        }

        return answer;
    }
    
    public boolean isPrime(int num) {
        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) return false;
        }
        
        return true;
    }
}