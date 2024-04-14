def solution(genres, plays):
    answer = []
    genres_dict = {}
    play_dict = {}
    
    for i in range(len(genres)):
        genre = genres[i]
        play = plays[i]
        if genre not in genres_dict:
            genres_dict[genre] = []
            play_dict[genre] = 0
        genres_dict[genre].append((i, play))
        play_dict[genre] += play
        
    sorted_genres = sorted(play_dict.items(), key = lambda x : x[1], reverse = True)
    
    for genre, _ in sorted_genres:
        sorted_songs = sorted(genres_dict[genre], key = lambda x : (-x[1], x[0]))
        answer.extend([idx for idx, _ in sorted_songs[:2]])
        
    return answer