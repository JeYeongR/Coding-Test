import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
       HashMap<String, Integer> genrePlays = new HashMap<>(); // 많이 재생된 장르
        HashMap<Integer, Integer> songPlays = new HashMap<>(); // 고유 번호와 재생수
        HashMap<Integer, String> numPlays = new HashMap<>(); // 고유 번호와 장르

        for (int i = 0; i < genres.length; i++) {
            if (genrePlays.containsKey(genres[i])) {
                genrePlays.put(genres[i], genrePlays.get(genres[i]) + plays[i]);
                songPlays.put(i, plays[i]);
                numPlays.put(i, genres[i]);
            } else {
                genrePlays.put(genres[i], plays[i]);
                songPlays.put(i, plays[i]);
                numPlays.put(i, genres[i]);
            }
        }

        // 1. 속한 노래가 많이 재생된 장르순으로 정렬
        List<String> genrePlaysList = new ArrayList<>(genrePlays.keySet());
        Collections.sort(genrePlaysList, (s1, s2) -> genrePlays.get(s2) - genrePlays.get(s1));

        // 2. 장르 내에서 많이 재생된 노래순으로 정렬
        List<Integer> songPlaysList = new ArrayList<>(numPlays.keySet());
        Collections.sort(songPlaysList, (s1, s2) -> songPlays.get(s2) - songPlays.get(s1));

        List<Integer> album = new ArrayList<>();
        int count = 0;
        for (int j = 0; j < genrePlaysList.size(); j++) {
            for (int i = 0; i < genres.length; i++) {
                if (genrePlaysList.get(j).equals(numPlays.get(songPlaysList.get(i)))) {
                    album.add(songPlaysList.get(i));
                    count++;
                    if (count == 2) {
                        break;
                    }
                }
            }
            count = 0;
        }

        int[] answer = new int[album.size()];
        for(int i=0; i<album.size(); i++) {
            answer[i] = album.get(i);
        }
        return answer;
    }
}