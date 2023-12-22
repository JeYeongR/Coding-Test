function solution(brown, yellow) {
    let answer = [];
    let sum = brown + yellow;
    for(let i = 1; i <= sum; i++) {
        let width = i;
        let height = sum/i;
        if (width >= height) {
            if((width - 2) * (height - 2) === yellow) {
                answer.push(width);
                answer.push(height);
            }
        }
    }
    return answer;
}