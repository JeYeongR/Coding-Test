import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int greatestCommonDivisor = 0;
        for (int i = 1; i <= n && i <= k; i++) {
            if (n % i == 0 && k % i == 0) greatestCommonDivisor = i;
        }

        int leastCommonMultiple = (n * k) / greatestCommonDivisor;

        System.out.println(greatestCommonDivisor);
        System.out.println(leastCommonMultiple);
    }
}