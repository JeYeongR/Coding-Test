class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        if (slopeCalculation(dots[0], dots[1]) == slopeCalculation(dots[2], dots[3])) {
            answer = 1;
        }

       if (slopeCalculation(dots[0], dots[2]) == slopeCalculation(dots[1], dots[3])) {
            answer = 1;
        }

       if (slopeCalculation(dots[0], dots[3]) == slopeCalculation(dots[1], dots[2])) {
            answer = 1;
        }

        return answer;
    }

    public double slopeCalculation(int[] dots1, int[] dots2) {
        return (double) (dots1[1] - dots2[1]) / (dots1[0] - dots2[0]);
    }
}