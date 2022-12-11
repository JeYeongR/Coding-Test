import java.util.HashSet;
import java.util.Set;

class Solution {
     Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;

        combinationNum("", numbers);

        // 2. 소수인지 확인하여 카운트하기
        for (Integer n : set) {
            boolean pass = true;
            if (n == 0 || n == 1) {
                continue;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    pass = false;
                    break;
                }
            }

            if (pass == true) {
                answer++;
            }
        }

        return answer;
    }

    // 1. 숫자를 조합하여 여러 개를 만듬
    public void combinationNum(String str, String numbers) {
        if (!str.equals("")) {
            set.add(Integer.parseInt(str));
        }

        for (int i = 0; i < numbers.length(); i++) {
            combinationNum(str + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }
}