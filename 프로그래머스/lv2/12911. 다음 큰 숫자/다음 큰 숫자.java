class Solution {
    public int solution(int n) {
        String binaryString = Integer.toBinaryString(n);

        int count1 = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') count1++;
        }

        int count2 = 0;
        int num = n;
        while (count1 != count2) {
            count2 = 0;
            num++;
            String temp = Integer.toBinaryString(num);
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '1') count2++;
            }
        }

        return num;
    }
}