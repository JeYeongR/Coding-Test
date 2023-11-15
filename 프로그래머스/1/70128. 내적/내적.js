function solution(a, b) {
    let answer = 0;
    for(idx in a) {
        answer += a[idx] * b[idx]
    }
    return answer;
}