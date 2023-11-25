function solution(s, n) {
    let answer = "";
    for (let i in s) {
        if(s.charAt(i) === " ") {
            answer += " ";
            continue;
        }
        const tempCode = s.charCodeAt(i);
        if (tempCode >= 97) {
            answer += String.fromCharCode(tempCode + n > 122 ? tempCode - 26 + n : tempCode + n);
        } else {
            answer += String.fromCharCode(tempCode + n > 90 ? tempCode - 26 + n : tempCode + n);
        }
    }
    return answer;
}