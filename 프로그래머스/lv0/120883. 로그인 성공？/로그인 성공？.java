class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        boolean isTrueId = false;
        boolean isTruePw = false;
        
        for(int i=0; i<db.length; i++) {
            if(id_pw[0].equals(db[i][0])) {
                isTrueId = true;
                if(id_pw[1].equals(db[i][1])) {
                    isTruePw = true;
                    break;
                }         
            }
        }
        
        if(isTrueId && isTruePw) {
            answer = "login";
        } else if(isTrueId) {
            answer = "wrong pw";
        } 
        
        return answer;
    }
}