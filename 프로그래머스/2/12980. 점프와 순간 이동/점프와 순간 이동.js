function solution(n) {
    let answer = 0;
    while(n > 0) {
        answer += n % 2;
        n = Math.floor(n / 2);
    }
    return answer;
}