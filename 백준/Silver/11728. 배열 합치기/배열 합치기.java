import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arrA = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        int[] arrB = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        int aIdx = 0;
        int bIdx = 0;
        int answerIdx = 0;
        int[] answer = new int[N + M];
        while (answerIdx != N + M) {
            int num;
            if (aIdx < N && bIdx < M && arrA[aIdx] < arrB[bIdx]) {
                num = arrA[aIdx++];
            } else if (bIdx == M) {
                num = arrA[aIdx++];
            } else {
                num = arrB[bIdx++];
            }

            answer[answerIdx++] = num;
        }

        for (int num : answer) {
            bw.write(num + " ");
        }

        bw.flush();
    }
}