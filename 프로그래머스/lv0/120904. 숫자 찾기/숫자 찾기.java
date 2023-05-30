class Solution {
    public int solution(int num, int k) {
        return String.valueOf(num).indexOf(String.valueOf(k)) == -1 ? -1 : String.valueOf(num).indexOf(String.valueOf(k))+1;
    }
}