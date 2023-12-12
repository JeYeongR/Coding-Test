function solution(n, m, section) {
    let answer = 0;
    let max = 0;
    for(let e of section) {
        if(max < e) {
            max = e + m - 1;
            answer++;
        }
    }
    return answer;
}