import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
     PriorityQueue<Integer> pq = new PriorityQueue<>();
    	int answer = 0;
    	
    	for( int i : scoville) {
    		pq.offer(i);
    	}
        
        while(pq.peek() < K) {
                if(pq.size() == 1) {
        	    	return -1; 
        	    }
        		int food1 = pq.poll();
            	int food2 = pq.poll();
            	int nfood = food1+(food2*2);
            	pq.offer(nfood);
            	answer++;
        		
        }
        return answer;
    }
}
