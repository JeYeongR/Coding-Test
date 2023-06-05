class Solution {
     public String solution(String polynomial) {
        String answer;
        polynomial = polynomial.replace(" + ", " ");
        String[] strs = polynomial.split(" ");

        int x = 0;
        int num = 0;
        for (String str : strs) {
            if (str.contains("x")) {
                if (str.length() == 1) {
                    x++;
                } else {
                    x += Integer.parseInt(str.replace("x", ""));
                }
            } else {
                num += Integer.parseInt(str);
            }
        }

        if (num == 0) {
            if(x == 1) {
                answer = "x";
            } else {
                answer = x + "x";
            }
        } else if (x == 0) {
            answer = String.valueOf(num);
        } else {
            if(x == 1) {
                answer = "x + " + num;
            } else {
                answer = x + "x + " + num;
            }
        }
        
        return answer;
    }
}