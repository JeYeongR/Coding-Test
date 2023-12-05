function solution(cards1, cards2, goal) {
    for(const str of goal) {
        if(cards1[0] === str) {
            cards1.shift();
        } else if(cards2[0] === str) {
            cards2.shift();
        } else {
            return "No";
        }
    }
    
    return "Yes";
}