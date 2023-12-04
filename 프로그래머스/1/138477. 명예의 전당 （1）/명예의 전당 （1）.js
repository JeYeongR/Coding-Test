function solution(k, score) {
    const stack = [];
    const answer = [];
    score.forEach(val => {
        stack.push(val);
        stack.sort((a, b) => a - b);
        
        if(stack.length > k) stack.shift();
        
        answer.push(stack[0]);
    })
    return answer;
}