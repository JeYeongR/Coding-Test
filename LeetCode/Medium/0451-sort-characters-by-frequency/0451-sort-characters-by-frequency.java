class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Queue<Character> queue = new PriorityQueue<>((o1, o2) -> map.get(o2) - map.get(o1));
        for (Character character : map.keySet()) {
            queue.offer(character);
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            char temp = queue.poll();

            for (int i = 0; i < map.get(temp); i++) {
                sb.append(temp);
            }
        }

        return sb.toString();
    }
}