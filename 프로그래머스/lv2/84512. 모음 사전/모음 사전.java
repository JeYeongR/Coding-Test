class Solution {
   // 1. 순서대로 알파벳 조합하면서 카운트
    // 2. 원하는 단어가 만들어지면 카운트를 반환

    int answer = 0;
    boolean isFind;
    
    public int solution(String word) {
        find(0, word, "");

        return answer;
    }

    public void find(int idx, String word, String str) {
        char[] arr = {'A', 'E', 'I', 'O', 'U'};
        
        for (int i = idx; i < 5; i++) {
            String words = str + arr[i];
            answer++;
            
            if (word.equals(words)) {
                isFind = true;
                return;
            }

            if (words.length() == 5) {
                continue;
            }

            find(idx, word, words);

            if(isFind) {
                return;
            }
        }
    }
}
