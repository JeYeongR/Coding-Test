import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println(min);
        System.out.println(max);
    }
}