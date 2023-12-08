function solution(answers) {
    let answer = [];
    const a = [1, 2, 3, 4, 5];
    const b = [2, 1, 2, 3, 2, 4, 2, 5];
    const c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    let counts = [0, 0, 0];
    
    for(let i in answers) {
        if(answers[i] === a[i % a.length]) counts[0]++;
        if(answers[i] === b[i % b.length]) counts[1]++;
        if(answers[i] === c[i % c.length]) counts[2]++;
    }
    
    const max = Math.max(...counts);
    for(let i in counts) {
        if(max === counts[i]) answer.push(+i + 1);
    }
    
    return answer;
}