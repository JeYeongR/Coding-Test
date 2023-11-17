function solution(s) {
    const answer = s.split("").filter(a => {
        if(!Number.isNaN(+a)) return a
    }).join("");
    
    const answerLength = answer.length;
    return s.length === answerLength && (answerLength === 4 || answerLength === 6)
}