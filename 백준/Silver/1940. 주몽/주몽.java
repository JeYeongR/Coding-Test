import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int count = 0;
		int i = 0;
		int j = N - 1;
		while (i < j) {
			if (A[i] + A[j] < M) {
				i++;
			} else if (A[i] + A[j] > M) {
				j--;
			} else {
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
		br.close();
	}
}