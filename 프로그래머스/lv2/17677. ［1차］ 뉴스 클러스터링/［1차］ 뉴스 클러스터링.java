import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> str1List = new ArrayList<>();
        List<String> str2List = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            String temp = str1.substring(i, i + 2)
                    .toLowerCase()
                    .replaceAll("[^a-z]", "");

            if (temp.length() == 2) str1List.add(temp);
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String temp = str2.substring(i, i + 2)
                    .toLowerCase()
                    .replaceAll("[^a-z]", "");

            if (temp.length() == 2) str2List.add(temp);
        }

        if (str1List.isEmpty() && str2List.isEmpty()) return 65536;

        int sum = str1List.size() + str2List.size();
        int same = 0;
        for (String s : str1List) {
            for (int j = 0; j < str2List.size(); j++) {
                if (s.equals(str2List.get(j))) {
                    same++;
                    str2List.remove(j);
                    break;
                }
            }
        }

        sum -= same;

        return (int) ((float) same / sum * 65536);
    }
}