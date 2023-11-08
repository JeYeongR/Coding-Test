function solution(numer1, denom1, numer2, denom2) {
    const answer = [];
    let numer = numer1 * denom2 + numer2 * denom1;
    let denom = denom1 * denom2;
    
    let max;
    for(let i = 1; i <= numer && i <= denom; i++) {
        if(numer % i === 0 && denom % i === 0) max = i;
    }
    
    answer.push(numer/max)
    answer.push(denom/max)
    
    return answer;
}