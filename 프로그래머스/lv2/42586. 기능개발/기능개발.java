import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> an = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();

        for (int i : progresses) {
            que.offer(i);
        }

        int[] counts = new int[progresses.length];

        for (int i = 0; i < speeds.length; i++) {
            int count = 0;
            int sum = 0;
            while (true) {
                sum += speeds[i];
                count++;
                if (que.peek() + sum >= 100) {
                    que.poll();
                    counts[i] = count;
                    break;
                }
            }
        }

        for(int i=0; i<counts.length; i++) {
            int rec = 1;
            for(int j=i+1; j<counts.length; j++) {
                if(counts[i]>=counts[j]) {
                    rec++;
                } else {
                    break;
                }
            }
            i += rec-1;
            an.add(rec);
        }

        int[] answer = new int[an.size()];

        for(int i=0; i<an.size(); i++) {
            answer[i] = an.get(i);
        }
        return answer;
    }
}