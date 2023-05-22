class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rsps = rsp.split("");
        
        for(String str : rsps) {
            if(str.equals("2")) {
                answer += "0";
            } else if(str.equals("0")) {
                answer += "5";
            } else {
                answer += "2";
            }
        }
        
        return answer;
    }
}