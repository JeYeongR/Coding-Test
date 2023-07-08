class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int count;
        int sum1 = 0;
        int num1 = 1;
        for (int i = 0; i < player1.length; i++) {
            sum1 += player1[i] * num1;

            num1 = 1;
            count = 0;
            for (int j = i; j >= 0; j--) {
                count++;
                if (player1[j] == 10) num1 = 2;

                if (count == 2) break;
            }
        }

        int sum2 = 0;
        int num2 = 1;
        for (int i = 0; i < player2.length; i++) {
            sum2 += player2[i] * num2;

            num2 = 1;
            count = 0;
            for (int j = i; j >= 0; j--) {
                count++;
                if (player2[j] == 10) num2 = 2;

                if (count == 2) break;
            }
        }

        if (sum1 > sum2) {
            return 1;
        } else if (sum1 == sum2) {
            return 0;
        } else {
            return 2;
        }
    }
}