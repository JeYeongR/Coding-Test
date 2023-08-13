import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();


        if (M >= 2) {
            for (int i = M; i <= N; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) list.add(i);
            }
        } else {
            for (int i = 2; i <= N; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) list.add(i);
            }
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
