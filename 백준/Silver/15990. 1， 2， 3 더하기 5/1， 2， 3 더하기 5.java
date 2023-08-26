import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }

        long[] answer = new long[100001];
        long[][] elements = new long[100001][4];
        elements[1][1] = 1;
        elements[1][2] = 0;
        elements[1][3] = 0;
        elements[2][1] = 0;
        elements[2][2] = 1;
        elements[2][3] = 0;
        elements[3][1] = 1;
        elements[3][2] = 1;
        elements[3][3] = 1;
        answer[1] = elements[1][1] + elements[1][2] + elements[1][3];
        answer[2] = elements[2][1] + elements[2][2] + elements[2][3];
        answer[3] = elements[3][1] + elements[3][2] + elements[3][3];

        for (int i = 4; i < answer.length; i++) {
            elements[i][1] = (answer[i - 1] - elements[i - 1][1]) % 1000000009;
            elements[i][2] = (answer[i - 2] - elements[i - 2][2]) % 1000000009;
            elements[i][3] = (answer[i - 3] - elements[i - 3][3]) % 1000000009;
            answer[i] = (elements[i][1] + elements[i][2] + elements[i][3]);
        }

        for (int j : arr) {
            System.out.println(answer[j] % 1000000009);
        }
    }
}