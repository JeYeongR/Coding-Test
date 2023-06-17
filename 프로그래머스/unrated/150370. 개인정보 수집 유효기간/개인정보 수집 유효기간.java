import java.util.*;
import java.time.LocalDate;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        String[] day = today.split("\\.");
        int todayCount = Integer.parseInt(day[0]) * 12 * 28 + Integer.parseInt(day[1]) * 28 + Integer.parseInt(day[2]);

        for (String term : terms) {
            String[] split = term.split(" ");
            for (int j = 0; j < privacies.length; j++) {
                if (privacies[j].contains(split[0])) {
                    String[] privacy = privacies[j].split(" ")[0].split("\\.");
                    int plusMonth = Integer.parseInt(privacy[1]) + Integer.parseInt(split[1]);
                    int privacyDayCount = Integer.parseInt(privacy[0]) * 12 * 28 + plusMonth * 28 + Integer.parseInt(privacy[2]) - 1;

                    if (privacyDayCount < todayCount) list.add(j + 1);
                }
            }
        }

        list.sort(Comparator.naturalOrder());

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}