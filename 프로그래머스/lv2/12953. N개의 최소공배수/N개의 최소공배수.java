class Solution {
    public int solution(int[] arr) {
        int answer =arr[0] * arr[1] / gcd(arr[0], arr[1]);
        
        for(int i=2; i<arr.length; i++) {
           answer = answer * arr[i] / gcd(answer, arr[i]);
        }
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        return a%b==0 ? b : gcd(b, a%b);
    }
}