import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String X, String Y) {
        List<Character> list = new ArrayList<>();
        Map<Character, Integer> mapX = new HashMap<>();
        Map<Character, Integer> mapY = new HashMap<>();

        for (char c : X.toCharArray()) {
            mapX.put(c, mapX.getOrDefault(c, 0) + 1);
        }

        for (char c : Y.toCharArray()) {
            mapY.put(c, mapY.getOrDefault(c, 0) + 1);
        }

        for (Character key : mapX.keySet()) {
            if (mapY.containsKey(key)) {
                int length = Math.min(mapX.get(key), mapY.get(key));

                for (int i = 0; i < length; i++) list.add(key);
            }
        }

        list.sort(Collections.reverseOrder());
        String result = list.stream()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());

        if (list.isEmpty()) result = "-1";

        if(result.replaceAll("0", "").isEmpty()) result = "0";

        return result;
    }
}