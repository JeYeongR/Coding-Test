def solution(n, words):
    used_words = set()
    prev_word = words[0][0]
    
    for i, word in enumerate(words):
        if word in used_words or word[0] != prev_word:
            return [(i % n) + 1, (i // n) + 1]
        used_words.add(word)
        prev_word = word[-1]
    return [0, 0]