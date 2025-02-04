import java.io.*;
import java.util.*;

public class Main {
    private static final int DNA_TYPES = 4; // A, C, G, T
    private static int[] required;
    private static int[] current;
    private static int satisfiedConditions;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int totalLength = Integer.parseInt(st.nextToken());
        int windowSize = Integer.parseInt(st.nextToken());
        char[] dna = br.readLine().toCharArray();
        
        required = new int[DNA_TYPES];
        current = new int[DNA_TYPES];
        satisfiedConditions = 0;
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < DNA_TYPES; i++) {
            required[i] = Integer.parseInt(st.nextToken());
            if (required[i] == 0) satisfiedConditions++;
        }

        int validCount = 0;
        
        for (int i = 0; i < windowSize; i++) {
            addChar(dna[i]);
        }
        if (satisfiedConditions == DNA_TYPES) validCount++;

        for (int i = windowSize; i < totalLength; i++) {
            int removedIndex = i - windowSize;
            addChar(dna[i]);
            removeChar(dna[removedIndex]);
            if (satisfiedConditions == DNA_TYPES) validCount++;
        }

        System.out.println(validCount);
        br.close();
    }

    private static void addChar(char c) {
        int idx = getIndex(c);
        current[idx]++;
        if (current[idx] == required[idx]) {
            satisfiedConditions++;
        }
    }

    private static void removeChar(char c) {
        int idx = getIndex(c);
        if (current[idx] == required[idx]) {
            satisfiedConditions--;
        }
        current[idx]--;
    }

    private static int getIndex(char c) {
		switch (c) {
			case 'A':
				return 0;
			case 'C':
				return 1;
			case 'G':
				return 2;
			case 'T':
				return 3;
			default:
				throw new IllegalArgumentException("Invalid DNA character");
		}
    }
}
