import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }
        
        return list.size() == 0 ? new int[]{-1} : Arrays.copyOfRange(arr, list.get(0), list.get(list.size()-1)+1);
    }
}