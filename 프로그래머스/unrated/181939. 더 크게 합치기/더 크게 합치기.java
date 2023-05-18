class Solution {
    public int solution(int a, int b) {
        String frontA = "" + a + b;
        String frontB = "" + b + a;

        return Math.max(Integer.parseInt(frontA), Integer.parseInt(frontB));
    }
}