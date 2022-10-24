import java.util.HashSet;

class Solution {
     public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> ph = new HashSet<>();

        for(String s : phone_book) {
            ph.add(s);
        }

        for(int i=0; i< phone_book.length; i++) {
            for(int j=1; j<phone_book[i].length(); j++) {
                if(ph.contains(phone_book[i].substring(0, j))) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}
