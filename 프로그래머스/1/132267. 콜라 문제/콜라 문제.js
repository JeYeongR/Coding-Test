function solution(a, b, n) {
    let answer = 0;
    while (n >= a) {
        const bonus = parseInt(n / a) * b;
        answer += bonus;
        n = bonus + n % a;
    }
    return answer;
}