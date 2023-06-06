class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String d : dic) {
            boolean check = false;
            int count = 0;
            for(String s : spell) {
                if(d.contains(s)) count++;    
            }
            
            if(count==spell.length) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}