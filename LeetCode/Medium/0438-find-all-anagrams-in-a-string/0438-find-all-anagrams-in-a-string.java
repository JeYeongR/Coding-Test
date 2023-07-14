class Solution {
     public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        
        if (s.length() < p.length()) return answer;
        
        for (int i = 0; i < p.length(); i++) {
            map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0) + 1);
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
        }


        if (map1.equals(map2)) answer.add(0);

        int lt = 0;
        for (int rt = p.length(); rt < s.length(); rt++) {

            map2.put(s.charAt(lt), map2.get(s.charAt(lt)) - 1);

            if (map2.get(s.charAt(lt)) == 0) map2.remove(s.charAt(lt));

            lt++;

            map2.put(s.charAt(rt), map2.getOrDefault(s.charAt(rt), 0) + 1);

            if (map1.equals(map2)) answer.add(lt);
        }

        return answer;
    }
}