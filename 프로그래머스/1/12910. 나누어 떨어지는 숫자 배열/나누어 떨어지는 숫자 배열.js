function solution(arr, divisor) {
    const answer = [];
    for(e of arr) {
        if(e % divisor === 0) answer.push(e);
    }

    
    answer.length !== 0 ? answer.sort((a, b) => a - b) : answer.push(-1);
    
    return answer;
}