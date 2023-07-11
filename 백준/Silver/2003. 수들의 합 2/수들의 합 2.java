import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int sum;
        int answer = 0;
        for (int rt = 0; rt < N; rt++) {
            sum = 0;
            for (int lt = rt; lt < N; lt++) {
                sum += arr[lt];

                if (sum == M) answer++;
            }
        }

        System.out.println(answer);
    }
}