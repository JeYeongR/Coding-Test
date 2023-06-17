import java.util.*;
import java.time.LocalDate;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        String[] day = today.split("\\.");
        LocalDate localdate = LocalDate.of(Integer.parseInt(day[0]), Integer.parseInt(day[1]), Integer.parseInt(day[2]));

        for (String term : terms) {
            String[] split = term.split(" ");
            for (int j = 0; j < privacies.length; j++) {
                if (privacies[j].contains(split[0])) {
                    String[] privacy = privacies[j].split(" ")[0].split("\\.");
                    int countYear = Integer.parseInt(privacy[0]);
                    int plusMonth = Integer.parseInt(privacy[1]) + Integer.parseInt(split[1]);
                    if (plusMonth > 12) {
                        countYear += plusMonth / 12;
                        plusMonth %= 12;
                    }

                    plusMonth = plusMonth == 0 ? 1 : plusMonth;
                    int countDay = Integer.parseInt(privacy[2]) - 1 <= 0 ? 28 : Integer.parseInt(privacy[2]) - 1;
                    LocalDate privacyDay = LocalDate.of(countYear, plusMonth, countDay);
                    if (privacyDay.isBefore(localdate)) list.add(j + 1);
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