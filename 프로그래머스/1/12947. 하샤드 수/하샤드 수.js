function solution(x) {
    let temp = x;
    let answer = 0;
    while (x > 0) {
        answer += x % 10;
        x = Math.floor(x / 10);
    }
    
    return Number.isInteger(temp / answer);
}