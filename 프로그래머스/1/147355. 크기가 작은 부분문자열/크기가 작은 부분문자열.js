function solution(t, p) {
    let answer = 0;
    let length = p.length;
    for (let i = 0; i <= t.length - length; i++) {
        if (+t.slice(i, i + length) <= +p) answer++;
    }
    return answer;
}