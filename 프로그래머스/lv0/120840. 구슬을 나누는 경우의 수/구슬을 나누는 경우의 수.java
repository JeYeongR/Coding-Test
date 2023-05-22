import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger multiplyBalls = BigInteger.valueOf(1);
        for (int i = 1; i <= balls; i++) {
            multiplyBalls = multiplyBalls.multiply(BigInteger.valueOf(i));
        }

        BigInteger multiplyShare = BigInteger.valueOf(1);
        for (int i = 1; i <= share; i++) {
            multiplyShare = multiplyShare.multiply(BigInteger.valueOf(i));
        }

        BigInteger multiply = BigInteger.valueOf(1);
        for (int i = 1; i <= balls - share; i++) {
            multiply = multiply.multiply(BigInteger.valueOf(i));
        }
        
        return multiplyBalls.divide(multiplyShare.multiply(multiply)).intValue();
    }
}