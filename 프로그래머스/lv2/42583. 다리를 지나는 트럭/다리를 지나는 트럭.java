import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>(); // 1. 다리를 큐로 만듬
        int answer = 0;

        int bridgeOn = 0; // 2. 다리에 차가 올라옴
        for (int i = 0; i < truck_weights.length; i++) {
            while(true) {
                if (bridge.isEmpty()) { //  2-1. 비어있을때
                    bridge.add(truck_weights[i]);
                    bridgeOn += truck_weights[i];
                    answer++;
                    break;
                } else { //  2-1. 차가 있을 때
                    // 3. 다음 차가 더 올라올 수 있는지 확인
                    if (bridge.size() != bridge_length) { //  3-1. 다리에는 bridge_length수 만큼 올라올수있음
                        if (weight >= (bridgeOn + truck_weights[i])) { //  3-2. 다리는 weigh까지 무게를 견딤
                            bridge.add(truck_weights[i]);
                            bridgeOn += truck_weights[i];
                            answer++;
                            break;
                        } else { // 3-3. 더 못 올라오면 지나갈때 까지 기다림
                            bridge.add(0); // 0을 넣어 건너게 함
                            answer++;
                        }
                    } else { // 3-3. 더 못 올라오면 지나갈때 까지 기다림
                        bridgeOn -= bridge.poll();
                    }
                }
            }

        }

        // 마지막 트럭이 나오는 시간도 더해줌
        return answer + bridge_length;
    }
}